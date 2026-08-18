package kr.ac.kopo.youngseo.springboot_ex.controller;

import kr.ac.kopo.youngseo.springboot_ex.exception.UserException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping
public class Chap11_01Controller {
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "URI 요청이 잘못되었습니다.")
    @GetMapping("/exam01")
    public void requestMethod01() {
        System.out.println(new IllegalArgumentException("요청 실패").getMessage());
    }

    @GetMapping("/exam02_1")
    public void requestMethod02() throws Exception{
        throw new Exception(new UserException("UserException Message"));
    }
}
