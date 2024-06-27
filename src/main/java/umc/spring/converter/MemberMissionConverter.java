package umc.spring.converter;

import org.springframework.data.domain.Page;
import umc.spring.domain.Member;
import umc.spring.domain.Mission;
import umc.spring.domain.enums.MissionStatus;
import umc.spring.domain.mapping.MemberMission;
import umc.spring.web.dto.MemberMissionDto.MemberMissionResponseDTO;

import java.util.List;
import java.util.stream.Collectors;

public class MemberMissionConverter {
    public static MemberMission toMemberMission(Member member, Mission mission) {
        return MemberMission.builder()
                .member(member)
                .mission(mission)
                .missionStatus(MissionStatus.CHALLENGING)
                .build();
    }

    public static MemberMissionResponseDTO.MemberMissionResultDto toMemberMissionResultDto(MemberMission memberMission) {
        return MemberMissionResponseDTO.MemberMissionResultDto.builder()
                .memberMissionId(memberMission.getId())
                .memberId(memberMission.getMember().getId())
                .missionId(memberMission.getId())
                .missionStatus(memberMission.getMissionStatus().name())
                .build();
    }

    public static MemberMissionResponseDTO.MemberMissionListDto memberMissionPreviewListDto(Page<MemberMission> memberMissionPage) {
        List<MemberMissionResponseDTO.MemberMissionResultDto> memberMissionResultDtoList = memberMissionPage.stream()
                .map(MemberMissionConverter::toMemberMissionResultDto)
                .collect(Collectors.toList());

        return MemberMissionResponseDTO.MemberMissionListDto.builder()
                .isLast(memberMissionPage.isLast())
                .isFirst(memberMissionPage.isFirst())
                .totalPage(memberMissionPage.getTotalPages())
                .totalElements(memberMissionPage.getTotalElements())
                .listSize(memberMissionResultDtoList.size())
                .missionList(memberMissionResultDtoList)
                .build();
    }
}
