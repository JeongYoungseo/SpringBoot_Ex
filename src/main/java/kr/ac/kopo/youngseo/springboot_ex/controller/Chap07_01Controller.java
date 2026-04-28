package kr.ac.kopo.youngseo.springboot_ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public String requestFileUploadResult(MultipartHttpServletRequest request, Model model){
        String name = request.getParameter("name");
        MultipartFile file = request.getFile("fileImage");

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
