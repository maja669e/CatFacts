package com.example.demo.service;

import com.google.gson.Gson;
import com.google.gson.internal.$Gson$Preconditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;

public class CatService {
    ArrayList<CatFact> catFacts = new ArrayList<>();

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
        for (int i = 0; i < 10; i++) {
            URL catURL = new URL("https://cat-fact.herokuapp.com/facts/random");
            BufferedReader inputFromCatURL = new BufferedReader(new InputStreamReader(catURL.openStream()));
            CatFact data = new Gson().fromJson(inputFromCatURL, CatFact.class);
            catFacts.add(data);
            System.out.println(data);
        }
        return catFacts;
    }

    public ArrayList<CatFact> SortArrayList() throws IOException {
        for (int i = 0; i < 10; i++) {
            URL catURL = new URL("https://cat-fact.herokuapp.com/facts/random");
            BufferedReader inputFromCatURL = new BufferedReader(new InputStreamReader(catURL.openStream()));
            CatFact data = new Gson().fromJson(inputFromCatURL, CatFact.class);
            catFacts.add(data);
            Collections.sort(catFacts);
            System.out.println(data);
        }
        return catFacts;
    }
    /*
    Metode fungerer ikke
    public ArrayList<CatFact> doesItContain(char c, int n) throws IOException {
        if (!catFacts. )
        for (int i = 0; i < n; i++) {
            if (catFacts.contains(c)) {
                URL catURL = new URL("https://cat-fact.herokuapp.com/facts/random");
                BufferedReader inputFromCatURL = new BufferedReader(new InputStreamReader(catURL.openStream()));
                CatFact data = new Gson().fromJson(inputFromCatURL, CatFact.class);
                catFacts.add(data);
                System.out.println(data);
            }
            return catFacts;
        }

    }

     */
}