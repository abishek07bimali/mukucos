package com.example.cosmetic.Controller;



import com.example.cosmetic.Entity.Product;
import com.example.cosmetic.Pojo.UserPojo;
import com.example.cosmetic.Services.ProductServices;
import com.example.cosmetic.Services.UserServices;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserServices userService;
    private final ProductServices productServices;
    @GetMapping("/homepage")
    public String getSetting(Model model) {
        List<Product> productList=productServices.findAll();
        model.addAttribute("add", productList);

        List<Product> products = productServices.getThreeRandomData();

        model.addAttribute("productfetch", products);
        return "index";
    }

    @GetMapping("/signup") //first maa chaine kura
    public String getSignupPage(Model model) {
        model.addAttribute("create", new UserPojo());
        return "signin";
    }
    @PostMapping("/saveuser")
    public String saveUser(@Valid UserPojo userPojo) {
        userService.save(userPojo);
        return "redirect:/signup";
    }
}

