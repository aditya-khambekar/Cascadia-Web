package Entities.WildlifeScoringCards;

import Entities.Enums.CardAnimals;
import Entities.Player;

public interface ScoringCard {
    public Integer score(Player p);

    public CardAnimals getAnimal();
}
