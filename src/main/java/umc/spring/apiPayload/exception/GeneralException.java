package umc.spring.apiPayload.exception;

import umc.spring.apiPayload.code.BaseErrorCode;
import umc.spring.apiPayload.code.ErrorReasonDTO;

public class GeneralException extends RuntimeException {
    private BaseErrorCode code;

    public GeneralException(BaseErrorCode errorCode) {
        this.code = errorCode;
    }

    public ErrorReasonDTO getErrorReason() {
        if (this.code == null) {
            return null; // 또는 적절한 기본값 반환
        }
        return this.code.getReason();
    }

    public ErrorReasonDTO getErrorReasonHttpStatus() {
        if (this.code == null) {
            return null; // 또는 적절한 기본값 반환
        }
        return this.code.getReasonHttpStatus();
    }
}
