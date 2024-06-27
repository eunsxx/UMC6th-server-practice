package umc.spring.service.MemberMission;

import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import umc.spring.domain.Member;
import umc.spring.domain.Mission;
import umc.spring.domain.Review;
import umc.spring.domain.mapping.MemberMission;
import umc.spring.web.dto.MemberMissionDto.MemberMissionResponseDTO;
import umc.spring.web.dto.MissionDto.MissionStatusUpdateResponseDTO;

import java.util.Optional;

public interface MemberMissionQueryService {
    Optional<Member> findMember(Long id);

    Page<MemberMission> getMemberMissionList(Long memberId, Integer page);

    @Transactional
    MissionStatusUpdateResponseDTO.Response updateMissionStatusToCompleted(Long memberId, Long memberMissionId);
}
