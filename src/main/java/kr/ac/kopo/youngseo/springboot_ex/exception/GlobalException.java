package kr.ac.kopo.youngseo.springboot_ex.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//전역 Exception 처리가 필요할 때 사용
@ControllerAdvice(basePackages = {"kr.ac.kopo.youngseo"})
public class GlobalException {
    @ExceptionHandler(RuntimeException.class)
    public String handlerException(Exception ex, Model model) {
        model.addAttribute("data1", "GlobalException 처리 메시지");
        model.addAttribute("data2", ex.getMessage());
        return "viewPage11_01";
    }
}

