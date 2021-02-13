
/**
 *
 * @author Matthew Szablowski 991619660
 * 
 */
public class CardTrick {
    public static void main(String[] args)
    {
       CardCode card = new CardCode();
       
       card.setSuit("Spades");
       card.setValue(8);
       System.out.println(card.getSuit() + " " + card.getValue());
    }
    
}
