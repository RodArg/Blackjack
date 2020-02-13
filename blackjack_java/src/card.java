import java.util.*;

public class Card {
    String rank;
    char suit;
    boolean hidden;
    String[] visual = new String[7];
    Suits suits = new Suits();
    Card(String rank, char suit, boolean hidden){
        this.rank = rank;
        this.suit = suit;
        this.hidden = hidden;

        visual[0] = "┌─────────┐";
        if(this.rank.equals("10"))
            visual[1] = "│ 10      │";
        else
            visual[1] = String.format("| %s       |", rank);
        visual[2] = "│         │";
        visual[3] = String.format("│    %s    │",suits.getIcon(suit));
        visual[4] = "│         │";
        if(this.rank.equals("10"))
            visual[5] = "│      10 │";
        else
            visual[5] = String.format("|       %s |", rank);
        visual[6] = "└─────────┘";
    }

    String getRank(){ return rank; }
    char getSuit(){ return suit; }
    String getVisual(int row){ return visual[row]; }
    boolean isHidden(){ return hidden; }

    @Override
    public String toString() {
        if (hidden == true) {
            String[] cardBack = suits.getBack();
            for (int i = 0; i < cardBack.length - 1; i++) {
                cardBack[i] += "\n";
            }
            return String.join("", cardBack);
        }
        String[] temp = visual;
        for (int i = 0; i < temp.length - 1; i++) {
            temp[i] += "\n";
        }
        return String.join("", temp);
    }
}
