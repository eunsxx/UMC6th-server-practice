package umc.spring.service.MissionService;

import umc.spring.domain.Mission;
import umc.spring.web.dto.MissionDto.MissionRequestDTO;

public interface MissionCommandService {

    public Mission createMission(MissionRequestDTO.MissionCreateDto request);
}
