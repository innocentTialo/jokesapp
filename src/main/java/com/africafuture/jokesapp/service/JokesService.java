package com.africafuture.jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getAJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
