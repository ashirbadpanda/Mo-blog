package com.mobloh.moblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class BlogController {
    @GetMapping({"/","/blogs"})
    public String blogs(){
        return "blogs";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }

    @GetMapping("/add-blog")
    public String addblog() {
        return "add-blog";
    }
    
}
