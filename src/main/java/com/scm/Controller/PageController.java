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

    @RequestMapping("/about")
    public String aboutPage(Model model)
    {
        model.addAttribute("isLogged", false);
        System.out.println("This is about page ");
        return "about";
    }

    @RequestMapping("/services")
    public String servicePage()
    {
        System.out.println("This is Service Page");
        return "services";
    }

    @RequestMapping("/login")
    public String login()
    {
        return "login";
    }

    @RequestMapping("/register")
    public String register()
    {
        return "register";
    }

    @RequestMapping("/contact")
    public String contact()
    {
        return "contact";
    }
}
