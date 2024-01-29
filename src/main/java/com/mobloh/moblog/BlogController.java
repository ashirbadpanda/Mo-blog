package com.mobloh.moblog;

import java.io.PrintWriter;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;



@Controller
public class BlogController {
    private final List<Blog> blogs;

    public BlogController(){
        blogs = new ArrsyList<>();
    }


    @GetMapping({"/","/blogs"})
    public String blogs(Model model){
        model.addAttribute("blogs",blogs);
        return "blogs";
    }

    @GetMapping("/blog")
    public String blog(@ModelAttribute int id, Model model) {
        var blog = blogs.get(id);
        model.addAttribute("blog", blog);
        return "blog";
    }

    @PostMapping("/add-blog")
    public void addBlog(@ModelAttribute Blog blog, PrintWriter pw) {
        blogs.add(blog);
        return "redirect:/blogs";
    }
    
}
