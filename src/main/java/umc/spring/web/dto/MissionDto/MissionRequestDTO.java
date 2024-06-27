package umc.spring.web.dto.MissionDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

public class MissionRequestDTO {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class MissionCreateDto {
        private Integer reward;
        private LocalDate deadline;
        private String missionSpec;
        private Long storeId;
    }
}
