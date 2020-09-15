package com.example.demo.service;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;

public class CatService {
    CatFact catFact = new CatFact();
    public String getSingleFact() throws IOException {
        //Choose what API to consume
        URL catURL = new URL("https://cat-fact.herokuapp.com/facts/random");
        //Instantiate a Buffered Reader to consume the InputStream from the URL
        BufferedReader inputFromCatURL = new BufferedReader(new InputStreamReader(catURL.openStream()));
        //Map the data from Json to an object
        CatFact data = new Gson().fromJson(inputFromCatURL, CatFact.class);
        //Close the BufferedReader
        inputFromCatURL.close();

        return data.toString();
    }

    public ArrayList<CatFact> arrayListOfCatFacts() throws IOException {
        ArrayList<CatFact> catFacts = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            URL catURL = new URL("https://cat-fact.herokuapp.com/facts/random");
            BufferedReader inputFromCatURL = new BufferedReader(new InputStreamReader(catURL.openStream()));
            CatFact data = new Gson().fromJson(inputFromCatURL, CatFact.class);
            catFacts.add(data);
            System.out.println(data);
        }
        return catFacts;
    }

    public ArrayList<CatFact> SortArrayList() throws IOException {
        ArrayList<CatFact> catFacts = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            URL catURL = new URL("https://cat-fact.herokuapp.com/facts/random");
            BufferedReader inputFromCatURL = new BufferedReader(new InputStreamReader(catURL.openStream()));
            CatFact data = new Gson().fromJson(inputFromCatURL, CatFact.class);
            catFacts.add(data);
            //Collections.sort(catFacts.get(i).);
            System.out.println(data);
        }
        return catFacts;
    }

}