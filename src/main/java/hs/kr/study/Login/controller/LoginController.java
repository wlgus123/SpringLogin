package hs.kr.study.Login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @PostMapping("/login")
    public String login(@RequestParam("id") String id,
                        @RequestParam("pass") String pass,
                        Model m) {
        if(id.equals("jihyun") && pass.equals("0000")) {
            m.addAttribute("id", id);
            m.addAttribute("pass", pass);

            return "login";
        }

        return "wrong";
    }
}
