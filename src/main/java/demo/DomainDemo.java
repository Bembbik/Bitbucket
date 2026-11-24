package demo;

import java.time.LocalDate;

import domain.Album;
import domain.Musician;

/**
 * Необязательный класс для демонстрации: создаёт объекты домена и выводит их в консоль.
 * Запуск: ПКМ на классе -> Run 'DomainDemo.main()'.
 */
public class DomainDemo {

    public static void main(String[] args) {
        Musician queen = new Musician(1L, "Меркьюри Фредди Фаррух", "Фредди Меркьюри",
                LocalDate.of(1946, 9, 5), "Великобритания");
        Album opera = new Album(1L, "A Night at the Opera", 1975, 12, queen.getId(), queen);

        System.out.println(queen);
        System.out.println(opera);
    }
}
