package com.company.association.test;

import com.company.association.domain.Player;
import com.company.association.domain.Team;


public class PlayerTest03 {
    public static void main(String[] args) {
        Player player1 = new Player("Pele");
        Player player2 = new Player("Cafu");
        Player[] players = new Player[]{player1,player2};
        Team team = new Team("Brazil national football team",players);
        player1.setTeam(team);
        player1.print();
       team.printteam();

    }





}
