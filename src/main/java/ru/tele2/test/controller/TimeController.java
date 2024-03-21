package ru.tele2.test.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.tele2.test.dto.TimeWithZoneDto;
import ru.tele2.test.service.TimeService;

@RestController
@RequestMapping("/api/v1.0")
@RequiredArgsConstructor
@Tag(name = "Time API", description = "API для получения текущего времени сервера с точностью до секунд, " +
        "с указанием таймзоны.")
public class TimeController {
    private final TimeService timeService;

    @GetMapping("/time")
    @ResponseStatus(HttpStatus.OK)
    public TimeWithZoneDto getTimeWithZone() {
        return timeService.getTimeWithZone();
    }
}
