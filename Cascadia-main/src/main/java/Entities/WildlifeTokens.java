package Entities;

import static java.lang.System.*;
import Entities.Enums.CardAnimals;
import java.awt.image.*;
import java.util.*;
import javax.imageio.*;

public class WildlifeTokens {
    private CardAnimals animalType;
    private int xPos, yPos;

    // private buffered image
    public WildlifeTokens(CardAnimals animalType) {
        this.animalType = animalType;
        xPos = 0;
        yPos = 0;
    }

    @Override
    public String toString() {
        return animalType.toString();
    }

    public String getName() {
        return this.toString();
    }

    public CardAnimals getType() {
        return animalType;
    }

    public BufferedImage getImage() {
        BufferedImage image = null;
        try {
            switch (animalType) {
                case BEAR:
                    image = ImageIO.read(Objects.requireNonNull(WildlifeTokens.class
                        .getResource("/Tokens/BearToken.png")
                    ));
                    break;
                case ELK:
                    image = ImageIO.read(Objects.requireNonNull(WildlifeTokens.class
                        .getResource("/Tokens/ElkToken.png")
                    ));
                    break;
                case SALMON:
                    image = ImageIO.read(Objects.requireNonNull(WildlifeTokens.class
                        .getResource("/Tokens/SalmonToken.png")
                    ));
                    break;
                case HAWK:
                    image = ImageIO.read(Objects.requireNonNull(WildlifeTokens.class
                        .getResource("/Tokens/HawkToken.png")
                    ));
                    break;
                case FOX:
                    image = ImageIO.read(Objects.requireNonNull(WildlifeTokens.class
                        .getResource("/Tokens/FoxToken.png")
                    ));
                    break;
            }
        } catch (Exception e) {
            out.println("Error in WildLife Tokens Image");
        }
        return image;
    }
}
