package com.udacity.gradle.builditbigger.backend;

import andersonsv.com.br.jokelib.JokeGen;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    public String getData() {
        return new JokeGen().getRandomJoke();
    }
}