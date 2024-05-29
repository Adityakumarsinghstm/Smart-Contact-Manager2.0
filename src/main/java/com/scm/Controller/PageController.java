package com.scm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model)
    {
        model.addAttribute("name", "Aditya Kumar");
        model.addAttribute("gitHub", "https://github.com/Adityakumarsinghstm");
        return "home";
    }
}
