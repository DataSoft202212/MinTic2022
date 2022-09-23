package com.datasoft.mintic.softcontable.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

@Controller
public class IndexController {


    private final Logger LOG = Logger.getLogger("" + IndexController.class);

    @GetMapping("/")
    public String index(){

        return "index";
    }





}
