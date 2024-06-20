package umc.spring.apiPayload.code;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ReasonDTO {
    private String message;  // 오류 메시지
    private String code;     // 오류 코드
    private boolean isSuccess; // API 호출 성공 여부
    private HttpStatus httpStatus; // HTTP 상태 코드
}
