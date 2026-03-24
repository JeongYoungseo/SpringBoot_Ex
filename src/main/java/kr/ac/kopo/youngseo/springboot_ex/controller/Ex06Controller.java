package kr.ac.kopo.youngseo.springboot_ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Ex06Controller {
//    @GetMapping("/exam06")
//    public String request(Model model){
//        model.addAttribute("title1","Model 유형 연습1");
//        model.addAttribute("title2","문자열값 또는 객체참조값 전달 가능");
//        return "viewPage";
//    }

    @GetMapping("/exam06")
    public String request(Model model){
        model.addAttribute("title1","Model 유형 연습1");
        model.addAttribute("title2","문자열값 또는 객체참조값 전달 가능");
        return "view06";
    }
}
