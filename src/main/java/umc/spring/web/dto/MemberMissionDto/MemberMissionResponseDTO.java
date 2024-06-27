package umc.spring.web.dto.MemberMissionDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class MemberMissionResponseDTO {
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class MemberMissionResultDto {
        private Long memberMissionId;
        private Long memberId;
        private Long missionId;
        private String missionStatus;
    }
}
