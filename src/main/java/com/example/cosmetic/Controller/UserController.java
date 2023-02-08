package com.example.cosmetic.Controller;



import com.example.cosmetic.Pojo.UserPojo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    @GetMapping("/homepage") //first maa chaine kura
    public String getSetting(Model model) {
        return "index";
    }

    @GetMapping("/signup") //first maa chaine kura
    public String getSignupPage(Model model) {
        model.addAttribute("create", new UserPojo());
        return "signin";
    }
}

