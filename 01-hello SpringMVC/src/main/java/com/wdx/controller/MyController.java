package com.wdx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {

    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(@RequestParam(value = "rname" ,required = false) String name,
                               @RequestParam(value = "rage", required = false) Integer age) {
        ModelAndView mv = new ModelAndView();
        System.out.println("doSome方法执行了！！！");
        mv.addObject("name", name);
        mv.addObject("age", age);
        mv.setViewName("show");
        System.out.println("name="+name+",age="+age);
        return mv;
    }
}
