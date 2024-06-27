package umc.spring.web.dto.MemberMissionDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

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

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class MemberMissionListDto {
        private Boolean isLast;
        private Boolean isFirst;
        private Integer totalPage;
        private Long totalElements;
        private Integer listSize;
        private List<MemberMissionResultDto> missionList;
    }
}
