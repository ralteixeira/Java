package game.model;

import game.Game;
import org.ietf.jgss.GSSManager;

public class TestaGame {

    public static void main(String[] args) {

        Game game1 = new Game("Call Of Duty", "Açao- Guerra","PC",2022, 300);
        Game game2 = new Game("Formula1","Esportes(Corrida)","PS5",2021, 250);

        game1.visualiza();
        game2.visualiza();

    }
}
