import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    @Test
    public void test1() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Film1");
        String[] expected = {"Film1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        String[] expected = {"Film1", "Film2"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {
        FilmManager manager = new FilmManager(5);
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test6() {
        FilmManager manager = new FilmManager(3);
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        String[] expected = {"Film5", "Film4", "Film3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test7() {
        FilmManager manager = new FilmManager(7);
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test8() {
        FilmManager manager = new FilmManager(5);

        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test9() {
        FilmManager manager = new FilmManager(1);
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        String[] expected = {"Film5"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

