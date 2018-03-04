package kataLevel6;

import java.util.ArrayList;
import java.util.List;

/*
* kata level 6
* link https://www.codewars.com/kata/5853213063adbd1b9b0000be
* */
public class StreetFighter2CharacterSelection {

    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves) {
        List<String> highlitedPlayers = new ArrayList<>();
        int vertical = position[0];
        int horizontal = position[1];

        for (int i = 0; i < moves.length; i++) {
            String move = moves[i];
            switch (move) {
                case "up":
                    if (vertical == 1) {
                        highlitedPlayers.add(fighters[--vertical][horizontal]);
                    } else {
                        highlitedPlayers.add(fighters[vertical][horizontal]);
                    }
                    break;
                case "down":
                    if (vertical == 0) {
                        highlitedPlayers.add(fighters[++vertical][horizontal]);
                    } else {
                        highlitedPlayers.add(fighters[vertical][horizontal]);
                    }
                    break;
                case "right":
                    if (horizontal != 5) {
                        highlitedPlayers.add(fighters[vertical][++horizontal]);
                    } else {
                        horizontal = 0;
                        highlitedPlayers.add(fighters[vertical][horizontal]);
                    }
                    break;
                case "left":
                    if (horizontal != 0) {
                        highlitedPlayers.add(fighters[vertical][--horizontal]);
                    } else {
                        horizontal = 5;
                        highlitedPlayers.add(fighters[vertical][horizontal]);
                    }
                    break;
            }

        }
        return highlitedPlayers.toArray(new String[highlitedPlayers.size()]);
    }
}
