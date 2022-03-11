package com.example.kodillla.good.patterns.challenges;

import java.util.stream.Collectors;

class AppMovieStore {

    public static void main(String[] args) {
       MovieStore movieStore = new MovieStore();
       String theMovieStore = movieStore.getMovies().entrySet()
               .stream()
               .flatMap(e -> e.getValue().stream())
               .collect(Collectors.joining("!"));
       System.out.println(theMovieStore);
    }
}
