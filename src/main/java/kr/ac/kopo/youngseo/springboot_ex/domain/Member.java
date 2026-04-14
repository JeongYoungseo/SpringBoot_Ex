package kr.ac.kopo.youngseo.springboot_ex.domain;

import lombok.Data;

@Data
public class Member {
    private String id;
    private int passwd;
    private String city;
    private String gender;
    private String[] hobby;
    private String greetings;
}
