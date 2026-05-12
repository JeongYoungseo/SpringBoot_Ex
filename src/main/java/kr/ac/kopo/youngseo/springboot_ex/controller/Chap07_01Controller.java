package kr.ac.kopo.youngseo.springboot_ex.controller;

import kr.ac.kopo.youngseo.springboot_ex.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/chap07")
public class Chap07_01Controller {

    @GetMapping("/form")
    public String requestForm(){
        return "viewFilePage";
    }

    @PostMapping("/form")
    public String requestFileUploadResult(@ModelAttribute Member member, Model model){
//    public String requestFileUploadResult(@RequestParam("name")String name, @RequestParam("fileImage")MultipartFile file, Model model){
//    public String requestFileUploadResult(MultipartHttpServletRequest request, Model model){
        String name = member.getName();
        MultipartFile file = member.getFileImage();
        String originFilename = file.getOriginalFilename();
        File saveFile = new File("d:\\upload\\" + name + "_" + originFilename);

        try {
            file.transferTo(saveFile);
            model.addAttribute("title", "File Upload Result");
            model.addAttribute("originFileName",originFilename);
            model.addAttribute("saveFileName",saveFile.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "viewFilePageResult";
    }
}
