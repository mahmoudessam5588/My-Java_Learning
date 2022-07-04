package com.company.association.test;

import com.company.association.domain.Player;
import com.company.association.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player = new Player("pele");
        Team team = new Team("Brazil Foot Ball");
        player.setTeam(team);
        player.print();

    }
}
