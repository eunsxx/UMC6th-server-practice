package umc.spring.converter;

import umc.spring.domain.Member;
import umc.spring.domain.Review;
import umc.spring.domain.Store;
import umc.spring.domain.enums.Gender;
import umc.spring.web.dto.MemberRequestDTO;
import umc.spring.web.dto.MemberResponseDTO;
import umc.spring.web.dto.ReviewRequestDTO;
import umc.spring.web.dto.ReviewResponseDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ReviewConverter {
    public static ReviewResponseDTO.ReviewResultDTO toReviewResultDTO(Review review){
        return ReviewResponseDTO.ReviewResultDTO.builder()
                .reviewId(review.getId())
                .body(review.getBody())
                .score(review.getScore())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static Review toReview(ReviewRequestDTO.CreateDto request, Member member, Store store) {

        return Review.builder()
                .body(request.getBody())
                .score(request.getScore())
                .member(member)
                .store(store)
                .build();
    }


}
