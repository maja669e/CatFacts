package com.example.demo.controller;

import com.example.demo.service.CatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class MyController {
    CatService catService = new CatService();


    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello. Welcome to our cat fact site.";
    }

    @GetMapping("/getSingleFact")
    @ResponseBody
    public String catSingleFact() throws IOException {
        return catService.getSingleFact();
    }

    @GetMapping("/getTenFacts")
    @ResponseBody
    public String catTenFacts() throws IOException {
        return catService.arrayListOfCatFacts().toString();
    }

    @GetMapping("/getTenSortByDate")
    @ResponseBody
    public String sortTenDate() throws IOException {
        return catService.SortArrayList().toString();
    }

    @GetMapping("/DoesItContain")
    @ResponseBody
    public String doesItContain(char c, int n, String facts) {
       return catService.doesItContain(c,n,facts);
    }

}
