package com.mybbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mybbs.controller.basecontroller.BaseController;

@Controller
public class IndexController extends BaseController{

    @RequestMapping(value="/index")
    public String goToIndex(){
        return "index";
    }
}
