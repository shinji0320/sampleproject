package com.example.sampleproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    @RequestMapping("/sample")
    public String sample() {
        return "sample";
    }

    @RequestMapping("/demo")
    public String demo() {
        return "demo";
    }

    @RequestMapping("/todo")
    public String todo() {
        return "todo";
    }

    @RequestMapping("/item")
    public String item() {
        return "item";
    }
}