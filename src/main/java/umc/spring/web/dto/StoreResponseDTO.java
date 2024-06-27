package umc.spring.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

public class StoreResponseDTO {
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class StoreResultDto {
        private Long storeId;
        private String name;
        private String address;
        private Float score;
        private LocalDateTime createdAt;
    }
}
