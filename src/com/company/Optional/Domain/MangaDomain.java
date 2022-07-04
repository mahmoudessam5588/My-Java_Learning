package com.company.Optional.Domain;

import java.util.Objects;

public class MangaDomain {
    private  Integer id;
    private  String title;
    private  int Episode;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEpisode(int episode) {
        Episode = episode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MangaDomain that = (MangaDomain) o;
        return Episode == that.Episode && id.equals(that.id) && title.equals(that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, Episode);
    }

    public MangaDomain(Integer id, String title, int episode) {
        this.id = id;
        this.title = title;
        Episode = episode;
    }

    public  Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getEpisode() {
        return Episode;
    }

    @Override
    public String toString() {
        return "MangaDomain{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", Episode=" + Episode +
                '}';
    }
}
