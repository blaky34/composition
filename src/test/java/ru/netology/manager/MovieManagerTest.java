package ru.netology.manager;

import lombok.Data;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieCatalog;

import static org.junit.jupiter.api.Assertions.*;

@Data
class MovieManagerTest {

    MovieManager manager = new MovieManager();

    private final MovieCatalog first = new MovieCatalog(1, 1, "Movie1", "action");
    private final MovieCatalog second = new MovieCatalog(2, 2, "Movie2", "action");
    private final MovieCatalog third = new MovieCatalog(3, 3, "Movie3", "action");
    private final MovieCatalog four = new MovieCatalog(4, 4, "Movie4", "action");
    private final MovieCatalog five = new MovieCatalog(5, 5, "Movie5", "action");
    private final MovieCatalog six = new MovieCatalog(6, 6, "Movie6", "action");
    private final MovieCatalog seven = new MovieCatalog(7, 7, "Movie7", "action");
    private final MovieCatalog eight = new MovieCatalog(8, 8, "Movie8", "action");
    private final MovieCatalog nine = new MovieCatalog(9, 9, "Movie9", "action");
    private final MovieCatalog ten = new MovieCatalog(10, 10, "Movie10", "action");
    private final MovieCatalog eleven = new MovieCatalog(11, 11, "Movie11", "action");


    @BeforeEach
    void prepareManager() {
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        manager.addMovie(nine);
        manager.addMovie(ten);
    }

    @Test
    void shouldAddMovie() {
        MovieCatalog[] actual = manager.addMovie(eleven);
        MovieCatalog[] expected = {first, second, third, four, five, six, seven, eight, nine, ten, eleven};

        assertArrayEquals(expected, actual);

    }


    @Test
    public void shouldGetAll() {
        MovieCatalog[] actual = manager.findAll();
        MovieCatalog[] expected = {ten, nine, eight, seven, six, five, four, third, second, first};
        assertArrayEquals(expected, actual);
    }


    @Test
    void shouldFindLast() {
        MovieCatalog[] actual = manager.findLast();
        MovieCatalog[] expected = {ten, nine, eight, seven, six, five, four, third, second, first};

        assertArrayEquals(expected, actual);
    }

}
