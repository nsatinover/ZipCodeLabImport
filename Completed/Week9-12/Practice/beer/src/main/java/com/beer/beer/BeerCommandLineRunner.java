package com.beer.beer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.stream.Stream;

@Component
public class BeerCommandLineRunner implements CommandLineRunner {

    @Autowired
    private BeerRepository beerRepository;

    @Override
    public void run(String... args) throws Exception {
        Stream.of("Kentucky Stout", "Good Morning", "Hazy", "King", "Bud", "Coors", "PBR")
                .forEach(
                        name -> beerRepository.save(new Beer(name))
                );
        beerRepository.findAll().forEach(System.out::println);
    }
}
