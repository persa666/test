package ru.tele2.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.tele2.test.controller.TimeController;
import ru.tele2.test.dto.TimeWithZoneDto;
import ru.tele2.test.mapper.TimeWithZoneMapper;
import ru.tele2.test.service.TimeService;

import java.time.LocalDateTime;
import java.time.ZoneId;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class TimeControllerTest {
    @Mock
    private TimeService timeService;
    @InjectMocks
    private TimeController timeController;

    @Test
    void testGetTimeWithZoneSuccessTest() {
        LocalDateTime mockDateTime = LocalDateTime.of(2024, 3, 21, 16, 0);
        ZoneId mockZoneId = ZoneId.of("Europe/Paris");
        TimeWithZoneDto mockTimeWithZoneDto = TimeWithZoneMapper.toTimeWithZoneDto(mockDateTime, mockZoneId);
        Mockito.when(timeService.getTimeWithZone()).thenReturn(mockTimeWithZoneDto);

        TimeWithZoneDto response = timeController.getTimeWithZone();

        assertThat(response).isEqualTo(mockTimeWithZoneDto);
    }
}
