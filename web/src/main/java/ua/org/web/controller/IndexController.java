package ua.org.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/index.htm")
    public ModelAndView index() throws IOException {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index/index");
        return mav;
    }
}