package TypesOfShows;

import Staff.Actor;
import Staff.Director;

import java.util.List;

public class Opera extends MusicalShow {

    private int choirSize;

    public Opera(String title,
                 int duration,
                 Director director,
                 List<Actor> listOfActors,
                 String musicAuthor,
                 String librettoText,
                 int choirSize) {

        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }
}