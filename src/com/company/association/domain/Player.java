package com.company.association.domain;

public class Player {
    private String name;
    private Team team;

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void print() {
        System.out.println(this.getName());
        if (this.team!=null) {
            System.out.println(this.team.getName());
        }
    }


}
