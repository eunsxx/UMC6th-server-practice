package umc.spring.service.ReviewService;

import org.springframework.transaction.annotation.Transactional;
import umc.spring.domain.Review;
import umc.spring.web.dto.ReviewDto.ReviewRequestDTO;

public interface ReviewCommandService {
    @Transactional
    Review createReview(ReviewRequestDTO.CreateDto request);
}
