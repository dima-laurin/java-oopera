package TypesOfShows;

import Staff.Actor;
import Staff.Director;

import java.util.List;

public class Show {

    private String title;
    private int duration;
    private Director director;
    private List<Actor> listOfActors;

    public Show(String title, int duration, Director director, List<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(List<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public void printActors() {
        if (listOfActors == null || listOfActors.isEmpty()) {
            System.out.println("Список актеров пуст.");
            return;
        }

        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors == null) {
            System.out.println("Список актёров не инициализирован.");
            return;
        }

        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " уже есть в спектакле. Добавление отменено.");
            return;
        }

        listOfActors.add(actor);
        System.out.println("Актёр " + actor + " успешно добавлен.");
    }


    public void replaceActor(Actor newActor, String surnameToReplace) {
        if (listOfActors == null || listOfActors.isEmpty()) {
            System.out.println("Список актёров пуст.");
            return;
        }

        for (int i = 0; i < listOfActors.size(); i++) {
            Actor current = listOfActors.get(i);

            if (current.getSurname().equals(surnameToReplace)) {
                listOfActors.set(i, newActor);
                System.out.println("Актёр " + current + " заменён на " + newActor);
                return;
            }
        }

        System.out.println("Актёр с фамилией " + surnameToReplace + " не найден.");
    }

    @Override
    public String toString() {
        return "Show.Show{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", director=" + director +
                ", listOfActors=" + listOfActors +
                '}';
    }
}