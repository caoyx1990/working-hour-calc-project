package com.caoyx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by caoyx on 2017/5/15 0015.
 */
@Controller
public class RestController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
