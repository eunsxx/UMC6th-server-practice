package umc.spring.apiPayload.exception.handler;

import umc.spring.apiPayload.code.status.ErrorStatus;

public class MemberMissionHandler extends RuntimeException {
    private final ErrorStatus errorStatus;

    public MemberMissionHandler(ErrorStatus errorStatus) {
        super(errorStatus.getMessage());
        this.errorStatus = errorStatus;
    }
}
