package kr.ac.kopo.youngseo.springboot_ex.domain;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class Member {
//    private String id;
//    private int passwd;
//    private String city;
//    private String gender;
//    private String[] hobby;
//    private String greetings;
    private String name;
    private MultipartFile fileImage;
}
