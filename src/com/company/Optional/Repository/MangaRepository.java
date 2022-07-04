package com.company.Optional.Repository;

import com.company.Optional.Domain.MangaDomain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static javax.swing.UIManager.get;

public class MangaRepository<T> {

    public static <T> void main(String[] args) {
        List<MangaDomain> mangaRepo = new ArrayList<>(List.of(new MangaDomain(1, "My Darling", 12), new MangaDomain(2, "Naruto", 500),
                new MangaDomain(3, "Space Brothers", 40)));

        Consumer<List<MangaDomain>> manga = s -> System.out.println(s.get(0));
        manga.accept(mangaRepo);
        Predicate<List<MangaDomain>> manga2 = t -> t.containsAll(mangaRepo);
        boolean test = manga2.test(mangaRepo);
        System.out.println(test);
        Function<List<MangaDomain>, Integer> size = List::size;
        Integer apply = size.apply(mangaRepo);
        System.out.println(apply);
        Optional<Optional<MangaDomain>> index = Optional.of(filter("Naruto"));
       Optional<MangaDomain> index2 = Optional.of(filter(1).orElseThrow(IllegalArgumentException::new));
        Optional<MangaDomain> index3 = Optional.of(filter(5).orElse(new MangaDomain(2,"Ueki",23)));

        System.out.println("----------------");
        System.out.println(index + "Index");
        System.out.println(index2 + "Index2");
        System.out.println(index3 + "Index3");

    }

    private static <T> Optional<MangaDomain> filter(T t) {
        List<MangaDomain> mangaRepo = List.of(new MangaDomain(1, "Bortu", 12), new MangaDomain(2, "Naruto", 500),
                new MangaDomain(3, "Space Brothers", 40));
        MangaDomain mangaDomains = null;
        for (MangaDomain mangaDomain : mangaRepo) {
            if (mangaDomain.getTitle().equals(t)) {
                mangaDomains = mangaDomain;
            }
            if (mangaDomain.getId().equals(t)) {
                mangaDomains = mangaDomain;
            }
        }
        return Optional.ofNullable(mangaDomains);

    }


}





