package com.listenzhangbin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhangbin on 16/4/12.
 */
@Controller
@RequestMapping(path = "/example")
public class HelloController {

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String welcome(Model model) {
        model.addAttribute("message", "Spring MVC Hello World!");
        return "hello";
    }

    @RequestMapping(path = "/name/{name}", method = RequestMethod.GET)
    public ModelAndView name(@PathVariable String name) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        modelAndView.addObject("message", name);
        return modelAndView;
    }
}
