package ru.tele2.test.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TimeWithZoneDto {
    @Schema(description = "Текущее время")
    private String date;
    @Schema(description = "Таймзона")
    private String timeZone;
}
