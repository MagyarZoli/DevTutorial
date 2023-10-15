package org.example.springboot.learningspring.util;

import com.magyarzoli.learningspring.data.Guest;
import com.magyarzoli.learningspring.data.Reservation;
import com.magyarzoli.learningspring.data.Room;
import com.magyarzoli.learningspring.repository.GuestRepository;
import com.magyarzoli.learningspring.repository.ReservationRepository;
import com.magyarzoli.learningspring.repository.RoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@AllArgsConstructor(onConstructor_ = {@Autowired})
@Component
public class AppStartupEvent
        implements ApplicationListener<ApplicationReadyEvent> {

    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        System.out.println("--rooms----------------------------------");
        Iterable<Room> rooms = this.roomRepository.findAll();
        rooms.forEach(System.out::println);
        System.out.println("--guests---------------------------------");
        Iterable<Guest> guests = this.guestRepository.findAll();
        guests.forEach(System.out::println);
        System.out.println("--reservations---------------------------");
        Iterable<Reservation> reservations = this.reservationRepository.findAll();
        reservations.forEach(System.out::println);
        System.out.println("-----------------------------------------");
    }
}