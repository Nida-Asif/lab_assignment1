import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {


    Card c1=new Card("clubs","Ace");
    Card c2=new Card("clubs","Ace");
    System.out.println(c1);
    System.out.println(c2);

    System.out.println(c1.equals(c2));
    Deck d1=new Deck();
    System.out.println(d1);
    Game game=new Game(d1);
    System.out.println(game);
}
    }