package ru.tele2.test.mapper;

import ru.tele2.test.dto.TimeWithZoneDto;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeWithZoneMapper {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public static TimeWithZoneDto toTimeWithZoneDto(LocalDateTime localDateTime, ZoneId zoneId) {
        return new TimeWithZoneDto(
                localDateTime.format(formatter),
                zoneId.toString()
        );
    }
}
