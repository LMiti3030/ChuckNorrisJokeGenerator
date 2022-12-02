package mititelu.laura.sfg.cnjg.chucknorrisjokegenerator.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * @author LMiti3030
 * created on 02.12.2022
 */
@Service
public class QuoteServiceImpl implements QuoteService{

    private static ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    @Override
    public String getRandomQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
