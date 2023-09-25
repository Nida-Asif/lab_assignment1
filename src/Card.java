public class Card {
    String suit;
    String rank;
    Card(String suit,String rank){
        this.suit=suit;
        this.rank=rank;
    }

    @Override
    public String toString() {
        return String.format("%s of %s",suit,rank);
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
    public boolean equals(Object o){
     Card temp=(Card)o;//downcast
     return rank.equals(temp.rank)&&suit.equals(temp.suit);
    }

}
