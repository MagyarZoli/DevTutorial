package org.example.auxiliary;

public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static Day[] midweek() {
        return new Day[]{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY};
    }

    public static Day[] weekend() {
        return new Day[]{SATURDAY, SUNDAY};
    }
}