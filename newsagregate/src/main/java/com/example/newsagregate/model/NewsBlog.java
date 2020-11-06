package com.example.newsagregate.model;

import ch.qos.logback.core.pattern.color.GreenCompositeConverter;
import com.example.newsagregate.Greeting;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class NewsBlog {


    public List<Greeting> getNewsList() {
        List<Greeting> listNews = new ArrayList<>();

        listNews.add(new Greeting("BOE Gives Bigger-Than-Expected QE Boost to Slumping Economy", "The Bank of England boosted its bond-buying program by a bigger-than-expected 150 billion pounds ($195 billion) in another round of stimulus to help the economy through a second wave of coronavirus restrictions"));
        listNews.add(new Greeting("Tourmaline Oil buys two privately held oil and gas firms for $526M", "CALGARY - Tourmaline Oil Corp. says it is buying two privately held oil and gas companies producing 76,000 barrels of oil equivalent per day for a total of about $526 million in cash and shares."));
        listNews.add(new Greeting("Canadian pot stocks down, but U.S. cannabis players rise amid mixed U.S. legalization election results", "While a pathway toward full federal cannabis legalization may be uncertain following Tuesday's U.S. election, several U.S. operators are cheering several state-led results that have voters in Arizona, New Jersey, South Dakota, Mississippi and Montana giving the green light to legalizing cannabis for either medical or recreational purposes. BNN Bloomberg's David George-Cosh has the details."));

        return listNews;
    }

}
