package umc.spring.web.dto.MemberMissionDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class MemberMissionRequestDTO {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class MemberMissionCreateDto {
        private Long memberId;
        private Long missionId;
    }
}
