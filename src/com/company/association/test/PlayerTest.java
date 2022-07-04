package com.company.association.test;

import com.company.association.domain.Player;

import java.util.Arrays;


public class PlayerTest {
    public static void main(String[] args) {
        Player p1 = new Player("scott");
        String player1 = p1.getName();
        Player p2 = new Player("Williams");
        String player2 = p2.getName();
        Player p3 = new Player("Andreia");
        String player3 = p3.getName();
        String[] playerList = new String[]{player1, player2, player3};
        Player[] players = new Player[]{p1, p2, p3};
        System.out.println(Arrays.asList(playerList));
        for (Player player : players) {
            player.print();



        }
    }
}
