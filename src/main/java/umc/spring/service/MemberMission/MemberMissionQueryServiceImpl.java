package umc.spring.service.MemberMission;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.spring.apiPayload.code.status.ErrorStatus;
import umc.spring.apiPayload.exception.handler.MemberMissionHandler;
import umc.spring.domain.Member;
import umc.spring.domain.enums.MissionStatus;
import umc.spring.domain.mapping.MemberMission;
import umc.spring.repository.MemberMissionRepository;
import umc.spring.repository.MemberRepository;
import umc.spring.web.dto.MissionDto.MissionStatusUpdateResponseDTO;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberMissionQueryServiceImpl implements MemberMissionQueryService {

    private final MemberRepository memberRepository;
    private final MemberMissionRepository memberMissionRepository;

    @Override
    public Optional<Member> findMember(Long id) {
        return memberRepository.findById(id);
    }

    @Override
    public Page<MemberMission> getMemberMissionList(Long memberId, Integer page) {
        Member member = memberRepository.findById(memberId).get();
        return memberMissionRepository.findAllByMember(member, PageRequest.of(page, 10));
    }

    @Override
    @Transactional
    public MissionStatusUpdateResponseDTO.Response updateMissionStatusToCompleted(Long memberId, Long memberMissionId) {
        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new MemberMissionHandler(ErrorStatus.MEMBER_NOT_FOUND));

        MemberMission memberMission = memberMissionRepository.findById(memberMissionId)
                .orElseThrow(() -> new MemberMissionHandler(ErrorStatus.MISSION_NOT_FOUND));

        if (!memberMission.getMember().getId().equals(member.getId())) {
            throw new MemberMissionHandler(ErrorStatus.UNAUTHORIZED_ACCESS);
        }
        memberMission.setMissionStatus(MissionStatus.COMPLETE);
        memberMissionRepository.save(memberMission);

        return MissionStatusUpdateResponseDTO.Response.builder()
                .memberMissionId(memberMission.getId())
                .missionStatus(memberMission.getMissionStatus().name())
                .build();
    }
}
