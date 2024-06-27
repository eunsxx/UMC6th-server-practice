package umc.spring.web.dto.ReviewDto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import umc.spring.domain.Member;
import umc.spring.domain.Store;

public class ReviewRequestDTO {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class CreateDto {
        private String title;
        private String body;
        private Float score;
        private Long memberId;
        private Long storeId;

    }
}
