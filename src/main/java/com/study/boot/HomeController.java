package com.study.boot;

import com.study.boot.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/index")
    public String index(Model model) {
        User user = new User(25, "park");
        model.addAttribute("user", user);

        return "index";
    }

}
