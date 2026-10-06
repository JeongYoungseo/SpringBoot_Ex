package kr.ac.kopo.youngseo.springboot_ex.controller;


import kr.ac.kopo.youngseo.springboot_ex.domain.Member3;
import kr.ac.kopo.youngseo.springboot_ex.repository.Member3Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


//JPA 1번째 예제
@Controller
@RequestMapping("/exam14_01")
public class Chap14_01Controller {
    @Autowired
    Member3Repository repository;


    @GetMapping
    public String viewHomePage(Model model){
        Iterable<Member3> memberList = repository.findAll();
        model.addAttribute("memberList",memberList);
        return "viewPage02";
    }

//  Create를 위한 입력 화면
    @GetMapping("/new")
    public String newInputMember3(Model model){
        Member3 member3 = new Member3();
        model.addAttribute("member",member3);
        return "viewPage02_new";
    }

//  Create(insert) 실행
    @PostMapping("/insert")
    public String insertMember3(@ModelAttribute("member") Member3 member3){
        repository.save(member3);
        return "redirect:/exam14_01";
    }

//  Update할 내용 입력
    @GetMapping("/edit/{id}")
    public String updateInputMethod(@PathVariable(name = "id")int id, Model model){
        Optional<Member3> member3 = repository.findById(id);
        model.addAttribute("member",member3);
        return "viewPage02_edit";
    }

    @PostMapping("/update")
    public String updateMember(@ModelAttribute("member") Member3 member3){
        repository.save(member3);
        return "redirect:/exam14_01";
    }
}
