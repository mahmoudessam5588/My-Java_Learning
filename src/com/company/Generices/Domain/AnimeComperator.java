package com.company.Generices.Domain;

import com.company.LambdaFunctions.Test.domain.AnimeAttributes;
import org.jetbrains.annotations.NotNull;

public class AnimeComperator {
        public static int sortByTitles(@NotNull AnimeAttributes a1 , @NotNull AnimeAttributes a2){return a1.getTitle().compareTo(a2.getTitle());};
        public  int sortByTitlesNotStatic(@NotNull AnimeAttributes a1 , @NotNull AnimeAttributes a2){return a1.getTitle().compareTo(a2.getTitle());};

}
