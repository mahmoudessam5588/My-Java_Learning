package com.company.LambdaFunctions.Test.domain;

public class AnimeAttributes {
    private String title;
    private String episode;

    public AnimeAttributes(String title, String episode) {
        this.title = title;
        this.episode = episode;
    }

    public String getTitle() {
        return title;
    }

    public String getEpisode() {
        return episode;
    }

    @Override
    public String toString() {
        return "AnimeAttributes{" +
                "title='" + title + '\'' +
                ", episode='" + episode + '\'' +
                '}';
    }
}
