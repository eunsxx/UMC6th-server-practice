package umc.spring.service.MemberMission;

import umc.spring.domain.mapping.MemberMission;
import umc.spring.web.dto.MemberMissionDto.MemberMissionRequestDTO;

public interface MemberMissionCommandService {
    public MemberMission createMemberMission(MemberMissionRequestDTO.MemberMissionCreateDto request);
}
