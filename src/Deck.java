import java.util.Random;

public class Deck {
    Card deck[]=new Card[52];

String suits[]=new String[4];{
    suits[0]="Clubs";
    suits[1]="Hearts";
    suits[2]="Diamond";
    suits[3]="Spades";
    }
    String rank[]={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    Deck(){
        int counter=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<13;j++){
                deck[counter++]=new Card(rank[j],suits[i]);
    }
    }
}
public String toString(){
        StringBuilder str=new StringBuilder();
        for (int i=0;i<52;i++){
            str.append(deck[i]+"\n");
        }
        return str.toString();
}
    public void Shuffle() {
        Random random = new Random();
        for (int j = 0; j < 6000; j++) {
            int randomIndex = random.nextInt(52);
            Card temp = deck[randomIndex];
            deck[randomIndex] = deck[j];
            deck[j] = temp;
        }
    }

}