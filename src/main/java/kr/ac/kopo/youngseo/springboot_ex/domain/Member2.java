package kr.ac.kopo.youngseo.springboot_ex.domain;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Member2 {
    @MemberId
    private String memberId;
    @Size(min = 4, max = 10, message = "4 ~ 10개의 문자열로 작성하세요.")
    private String passwd;
}
