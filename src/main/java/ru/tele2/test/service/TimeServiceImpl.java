package ru.tele2.test.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.tele2.test.dto.TimeWithZoneDto;
import ru.tele2.test.mapper.TimeWithZoneMapper;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Service
@RequiredArgsConstructor
public class TimeServiceImpl implements TimeService {

    @Override
    public TimeWithZoneDto getTimeWithZone() {
        return TimeWithZoneMapper.toTimeWithZoneDto(LocalDateTime.now(), ZoneId.systemDefault());
    }
}
