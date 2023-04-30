import java.util.ArrayList;
public class Deck {
    private ArrayList<Card> deck;

    public Deck(){
	    deck = new ArrayList<Card>(); 
    }
 

 //adds card 
    public void add(Card card){
	    deck.add(card);
    }


 //removes card
    public void remove(int x){
	    deck.remove(x);
    }

 // returns size
    public int size(){
	    int size = deck.size();
	    return size;
    }

    public Card getCard(int x){
	    return deck.get(x);
    }



 //prints out array
    public void print(){
	    System.out.print("[");
	    for(int i = 0; i < deck.size(); i++){
		    System.out.print(deck.get(i) + " ");
	    }
	    System.out.println("]");
    }

 
 //Shuffles cards 
    public void shuffle(){
	    for(int i = 0; i < 1000; i++){
		    int xIndex = (int)(Math.random()*deck.size());
		    int yIndex = (int)(Math.random()*deck.size());
		    Card x = deck.get(xIndex);
		    Card y = deck.get(yIndex);
		 
		    Card z = x;
		    x = y;
		    y = z;

		    deck.set(xIndex, x);
            deck.set(yIndex, y);
	    }
    }


 //Creating your deck in order (For loop to create card objects and add them to your deck)
    public void create(){
        for (int i = 1; i < 14; i++){
            deck.add(new Card(i, "Hearts"));
        }
        for (int i = 1; i < 14; i++){
            deck.add(new Card(i, "Spades"));
        }
        for (int i = 1; i < 14; i++){
            deck.add(new Card(i, "Clubs"));
        }
        for (int i = 1; i < 14; i++){
            deck.add(new Card(i, "Diamonds"));
        }
        System.out.println(deck);
    }

 //Outputting a random card from your deck (Random index into deck and return the value)
    public Card randomCard(){
        return deck.get((int)(Math.random()*52));
    }


 //Dealing the top card of your deck (Take the top card of your deck, save it, remove it from the deck, and then output it)
    public Card topCard(){
        int size = (deck.size())-1;
        Card top = deck.get(size);
        deck.remove(size); 
        return top;
    }

}
