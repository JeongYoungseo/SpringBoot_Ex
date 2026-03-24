package kr.ac.kopo.youngseo.springboot_ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Ex08Controller {
    @GetMapping("/exam08")
    public ModelAndView rqMethod(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("title1","ModelAndView");
        mav.addObject("title2","ModelAndView는 addObject()와 setViewName()를 사용");
        mav.setViewName("viewPage");
        return mav;
    }
}
