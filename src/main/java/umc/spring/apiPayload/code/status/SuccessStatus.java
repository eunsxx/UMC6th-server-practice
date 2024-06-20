package umc.spring.apiPayload.code.status;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import umc.spring.apiPayload.code.BaseCode;
import umc.spring.apiPayload.code.ReasonDTO;

public enum SuccessStatus implements BaseCode {
    _OK(HttpStatus.OK, "COMMON200", "서버 성공"),
    ;

    @Getter
    private final HttpStatus httpStatus;
    @Getter
    private final String code;
    @Getter
    private final String message;

    SuccessStatus(HttpStatus httpStatus, String code, String message) {
        this.httpStatus = httpStatus;
        this.code = code;
        this.message = message;
    }

    @Override
    public ReasonDTO getReason() {
        return null;
    }

    @Override
    public ReasonDTO getReasonHttpStatus() {
        return null;
    }

}
