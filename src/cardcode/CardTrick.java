
/**
 *
 * @author Matthew Szablowski 991619660
 * 
 */
public class CardTrick {
    public static void main(String[] args)
    {
       CardCode card1 = new CardCode();
       
       card1.setSuit("Clubs");
       card1.setValue(6);
       System.out.println(card1.getSuit() + " " + card1.getValue());
       
      CardCode card2 = new CardCode();
       
       card2.setSuit("Spades");
       card2.setValue(4);
       System.out.println(card2.getSuit() + " " + card2.getValue());
    }
    
}
