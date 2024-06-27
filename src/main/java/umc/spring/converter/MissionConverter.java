package umc.spring.converter;

import umc.spring.domain.Mission;
import umc.spring.domain.Store;
import umc.spring.web.dto.MissionDto.MissionRequestDTO;
import umc.spring.web.dto.MissionDto.MissionResponseDTO;

import java.time.LocalDateTime;

public class MissionConverter {

    public static Mission toMission(MissionRequestDTO.MissionCreateDto request, Store store) {
        return Mission.builder()
                .reward(request.getReward())
                .deadline(request.getDeadline())
                .missionSpec(request.getMissionSpec())
                .store(store)
                .build();
    }

    public static MissionResponseDTO.MissionResultDto toMissionResultDto(Mission mission) {
        return MissionResponseDTO.MissionResultDto.builder()
                .createdAt(LocalDateTime.now())
                .reward(mission.getReward())
                .deadline(mission.getDeadline())
                .missionSpec(mission.getMissionSpec())
                .missionId(mission.getId())
                .build();
    }
}
