package Panels;

import Entities.Enums.Habitats;
import Entities.Player;
import Entities.PrintTester;
import Entities.Scorer;
import Entities.WildlifeScoringCards.ScoringCard;
import java.util.*;

public class ScoreTesterPanel extends Thread {
    private static ArrayList<Player> players = new ArrayList<>();
    private static ArrayList<ScoringCard> cards = new ArrayList<>();
    private static HashSet<ScoreTesterPanel> panels = new HashSet<ScoreTesterPanel>();
    private static Boolean running = false;

    public ScoreTesterPanel(ArrayList<Player> players, ArrayList<ScoringCard> cards) {
        ScoreTesterPanel.players = players;
        ScoreTesterPanel.cards = cards;
    }

    public ScoreTesterPanel() {
    }

    public static void update() {
        if (running) {
        } else {
            running = true;
            ScoreTesterPanel s = new ScoreTesterPanel();
            s.run();
        }
    }

    public void run() {
        Scorer.score(players, cards);
        for (Player p : players) {
            for (ScoringCard c : cards) {
                PrintTester.print(
                        p.getName() + ", " + c.getAnimal() + ": " + p.getScore(c.getAnimal())
                );
            }
            for (Habitats h : Habitats.values()) {
                PrintTester.print(p.getName() + ", " + h + ": " + p.getScore(h));
            }
        }
        running = false;
    }
}
