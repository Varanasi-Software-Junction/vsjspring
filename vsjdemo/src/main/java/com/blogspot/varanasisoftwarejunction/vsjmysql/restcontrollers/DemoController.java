package com.blogspot.varanasisoftwarejunction.vsjmysql.restcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class DemoController {
    @GetMapping("/")
    public @ResponseBody
    String index() {

        return "Welcome to Varanasi Software Junction";
    }

    @GetMapping("/demo")
    public @ResponseBody
    String hellodemo() {

        return "Hello Demo";
    }

    @GetMapping("/getparam")
    public @ResponseBody
    String getparam(@RequestParam(name = "a", required = false, defaultValue = "0") String a, @RequestParam(name = "b", required = false, defaultValue = "1") String b) {

        return "Get " +  a + ":" + b;
    }

    @PostMapping("/postparam")
    public @ResponseBody
    String postparam(@RequestParam(name = "a", required = false, defaultValue = "0") String a, @RequestParam(name = "b", required = false, defaultValue = "1") String b) {

        return "Post " + a + ":" + b;
    }

    @GetMapping("/pathparam/{a}/{b}")
    public @ResponseBody
    String pathparam(@PathVariable Optional<String> a, @PathVariable Optional<String> b) {
        if (!a.isPresent())
            a = Optional.of("0");
        if (!b.isPresent())
            b = Optional.of("1");

        return "Path " +  a.get() + ":" + b.get();
    }
}
