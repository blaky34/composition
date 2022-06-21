package ru.netology.manager;

import lombok.Data;


import ru.netology.domain.MovieCatalog;

@Data

public class MovieManager {
    private MovieCatalog[] items = new MovieCatalog[0];

    private int countFilms = 10;

    public MovieManager() {
    }

    public MovieManager(int countFilms) {
        this.countFilms = countFilms;
    }

    public MovieCatalog[] addMovie(MovieCatalog item) {
        int length = items.length + 1;
        MovieCatalog[] tmp = new MovieCatalog[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
        return tmp;
    }

    public MovieCatalog[] findAll() {
        MovieCatalog[] tmp = new MovieCatalog[items.length];
        for (int i = 0; i < tmp.length; i++) {
            int index = items.length - i - 1;
            tmp[i] = items[index];
        }
        return tmp;
    }

    public MovieCatalog[] findLast() {
        int resultLength = this.countFilms;
        if (resultLength > items.length)
            resultLength = items.length;
        MovieCatalog[] result = new MovieCatalog[resultLength];
        for (int i = 0; i < items.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}
