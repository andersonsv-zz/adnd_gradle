package com.udacity.gradle.builditbigger.backend;

import andersonsv.com.br.jokelib.JokeGen;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        myData = new JokeGen().getRandomJoke();
        return myData;
    }
}