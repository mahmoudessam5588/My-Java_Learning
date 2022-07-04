package com.company.Collections.Test;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private Long id;
    private String title;
    private double price;
    private int quantity;

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Manga(Long id, String title, double price, int quantity) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return id.equals(manga.id) && title.equals(manga.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Manga(long id, String title, double price) {
        Objects.requireNonNull(id,"Id Value Must not be Null");
        Objects.requireNonNull(title,"Title Value Must not be Null");
        this.id = id;
        this.title = title;
        this.price = price;
    }


    @Override
    public int compareTo(@NotNull Manga other) {
        //return this.id.compareTo(other.id);
        return this.title.compareTo(other.title);
        //return Double.compare(this.price,other.price);
    }
}

