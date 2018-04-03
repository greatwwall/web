package com.xujun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
  * @todo 
  * @author xujun
  * @version 1.0
  * @date 2018年4月3日 下午1:26:31 
  */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/index")
    @ResponseBody
    public ModelAndView index(){
        ModelAndView model = new ModelAndView("test");
        return model;
    }
}
