package umc.spring.web.dto.MissionDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MissionResponseDTO {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class MissionResultDto {
        private Long missionId;
        private Integer reward;
        private LocalDate deadline;
        private String missionSpec;
        private LocalDateTime createdAt;
    }
}
