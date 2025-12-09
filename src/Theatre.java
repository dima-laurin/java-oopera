import Staff.Actor;
import Staff.Director;
import Staff.Gender;
import TypesOfShows.Show;
import TypesOfShows.Opera;
import TypesOfShows.Ballet;

import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        // 1. Актеры
        Actor actor1 = new Actor("Константин", "Соловьев", Gender.MALE, 189);
        Actor actor2 = new Actor("Игорь", "Суравков", Gender.MALE, 195);
        Actor actor3 = new Actor("Елена", "Лаурина", Gender.FEMALE, 165);

        // 2. Режиссеры
        Director director1 = new Director("Сергей", "Егоров", Gender.MALE, 10);
        Director director2 = new Director("Дарья", "Щербакова", Gender.FEMALE, 7);

        // 3. Автор музыки и хореограф
        String musicAuthor = "Ханс Циммер";
        String choreographer = "Сергей Шестиперов (Мигель)";

        // 4.
        // Спектакль
        Show regularShow = new Show(
                "Гарри Поттер и Проклятое дитя.",
                120,
                director1,
                new ArrayList<>()
        );
        // Опера
        Opera operaShow = new Opera(
                "Садко",
                150,
                director2,
                new ArrayList<>(),
                musicAuthor,
                "Либретто оперы «Садко»...",
                40
        );
        // Балет
        Ballet balletShow = new Ballet(
                "Лебединое озеро",
                140,
                director2,
                new ArrayList<>(),
                musicAuthor,
                "Либретто балета «Лебединое озеро»...",
                choreographer
        );

        // 5. Распределяем актёров по спектаклям

        // Спектакль
        regularShow.addActor(actor1);
        regularShow.addActor(actor2);

        // Опера
        operaShow.addActor(actor2);
        operaShow.addActor(actor3);

        // Балет
        balletShow.addActor(actor1);
        balletShow.addActor(actor3);

        // 6. Список актёров
        System.out.println("Актёры спектакля: " + regularShow.getTitle());
        regularShow.printActors();
        System.out.println();

        System.out.println("Актёры оперы: " + operaShow.getTitle());
        operaShow.printActors();
        System.out.println();

        System.out.println("Актёры балета: " + balletShow.getTitle());
        balletShow.printActors();
        System.out.println();

        // 7. Заменяем актёра в одном из спектаклей на актёра из другого спектакля

        System.out.println("Замена актёра в спектакле");
        regularShow.replaceActor(actor3, "Соловьев");
        System.out.println("Список актёров после замены для спектакля: " + regularShow.getTitle());
        regularShow.printActors();
        System.out.println();

        // 8. Попробуем заменить в другом спектакле несуществующего актёра
        System.out.println("Попытка замены несуществующего актёра в опере");
        operaShow.replaceActor(actor1, "Алексеев");
        System.out.println();

        // 9. Для оперы и балета выводим текст либретто
        System.out.println("Либретто оперы");
        operaShow.printLibretto();
        System.out.println();

        System.out.println("Либретто балета");
        balletShow.printLibretto();
        System.out.println();
    }
}
