import java.util.*;
public class Suits {
    HashMap <Character, Character> suitsMap = new HashMap<Character, Character>();
    String cardBack[] = new String[7];
    public Suits(){
        suitsMap.put('S', '♠');
        suitsMap.put('D', '♦');
        suitsMap.put('H', '♥');
        suitsMap.put('C', '♣');
        cardBack[0] = "┌─────────┐" ;
        cardBack[1] = "│*********│'";
        cardBack[2] = "│*********│";
        cardBack[3] = "│*********│";
        cardBack[4] = "│*********│";
        cardBack[5] = "│*********│";
        cardBack[6] = "└─────────┘";
    }
    char getIcon(char suit){
        return suitsMap.get(suit);
    }
    String[] getBack(){
        return cardBack;
    }
}
