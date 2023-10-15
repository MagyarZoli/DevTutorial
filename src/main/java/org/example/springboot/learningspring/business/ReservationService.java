package org.example.springboot.learningspring.business;

import com.magyarzoli.learningspring.data.Guest;
import com.magyarzoli.learningspring.data.Reservation;
import com.magyarzoli.learningspring.data.Room;
import com.magyarzoli.learningspring.repository.GuestRepository;
import com.magyarzoli.learningspring.repository.ReservationRepository;
import com.magyarzoli.learningspring.repository.RoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@AllArgsConstructor(onConstructor_ = {@Autowired})
@Service
public class ReservationService {

    private RoomRepository roomRepository;
    private GuestRepository guestRepository;
    private ReservationRepository reservationRepository;

    public List<RoomReservation> getRoomReservationsForDate(Date date) {
        Map<Long, RoomReservation> roomReservationMap = new HashMap<>();
        putRooms(roomReservationMap);
        setRoomRepository(roomReservationMap, date);
        return roomReservations(roomReservationMap);
    }

    private void putRooms(Map<Long, RoomReservation> roomReservationMap) {
        Iterable<Room> rooms = this.roomRepository.findAll();
        rooms.forEach(room -> {
            RoomReservation roomReservation = new RoomReservation();
            roomReservation.setRoomId(room.getId());
            roomReservation.setRoomName(room.getName());
            roomReservation.setRoomNumber(room.getRoomNumber());
            roomReservationMap.put(room.getId(), roomReservation);
        });
    }

    private void setRoomRepository(Map<Long, RoomReservation> roomReservationMap, Date date) {
        Iterable<Reservation> reservations = this.reservationRepository.findReservationByReservationDate(
                new java.sql.Date(date.getTime()));
        reservations.forEach(reservation -> {
            RoomReservation roomReservation = roomReservationMap.get(reservation.getRoomId());
            roomReservation.setDate(date);
            Guest guest = this.guestRepository.findById(reservation.getGuestId()).get();
            roomReservation.setFirstName(guest.getFirstName());
            roomReservation.setLastName(guest.getLastName());
            roomReservation.setGuestId(guest.getId());
        });
    }

    private List<RoomReservation> roomReservations(Map<Long, RoomReservation> roomReservationMap) {
        List<RoomReservation> roomReservations = new ArrayList<>();
        for (Long id : roomReservationMap.keySet()) {
            roomReservations.add(roomReservationMap.get(id));
        }
        roomReservations.sort((RoomReservation o1, RoomReservation o2) -> {
            if (o1.getRoomName().equals(o2.getRoomName())) {
                return o1.getRoomNumber().compareTo(o2.getRoomNumber());
            }
            return o1.getRoomName().compareTo(o2.getRoomName());
        });
        return roomReservations;
    }
}