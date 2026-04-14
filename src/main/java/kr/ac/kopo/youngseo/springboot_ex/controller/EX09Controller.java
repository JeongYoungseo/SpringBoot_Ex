package kr.ac.kopo.youngseo.springboot_ex.controller;

import kr.ac.kopo.youngseo.springboot_ex.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class EX09Controller {

    @GetMapping("/member")
    public String requestForm() {
        return "signUp";
    }
    @PostMapping("/member")
    public String requestFormResult(@ModelAttribute Member member, Model model) {
        model.addAttribute("member",member);
        return "signUpResult";
    }
    @InitBinder
    public void inItBinder(WebDataBinder binder){
//        binder.setAllowedFields("id", "city", "hobby");
        binder.setDisallowedFields("passwd", "city");
    }
}
