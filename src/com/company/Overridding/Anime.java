package com.company.Overridding;

record Anime(String name) {
    @Override
    public String name() {
        return name;
    }
}
