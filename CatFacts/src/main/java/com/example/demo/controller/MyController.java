package com.example.demo.controller;

import com.example.demo.service.CatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class MyController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello. Welcome to our cat fact site.";
    }
    @GetMapping("/getSingleFact")
    @ResponseBody
    public String catSingleFact() throws IOException {
        CatService catService = new CatService();
        return catService.getSingleFact();
    }
    @GetMapping("/getTenFacts")
    @ResponseBody
    public String catTenFacts() throws IOException {
        CatService catService = new CatService();
        return catService.arrayListOfCatFacts().toString();
    }

    @GetMapping("/getTenSortByDate")
    @ResponseBody
    public String sortTenDate() throws IOException {
        CatService catService = new CatService();
        return catService.SortArrayList().toString();
    }

    @GetMapping("/DoesItContain")
    @ResponseBody
    public String doesItContain(char c, int n, String facts) throws IOException {
        CatService catService = new CatService();
       return catService.doesItContain(c,n,facts);
    }

}
