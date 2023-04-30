public class Card{
	//Attributes for your constructor are value, suit, and facedown
	private int val;
	private String suit;
	private boolean facedown;

	//Constructor that takes in a value and suit and sets a default facedown value of False
	public Card(int val, String suit){
		this.val= val;
		this.suit = suit;
		this.facedown = false;
	} 

	//Constructor that lets you put in suit, value, and facedown as true/false
	public Card(int val, String suit , boolean  facedown){
		this.val= val;
		this.suit = suit;
		this.facedown = facedown;
	}

 	//Getters suit er (Accessors) to get facedown, suit, value, and the color (color is heart/diamond = red and spade/club = black)
	public int getVal(){
		return val; 
	}
	
	public String getsuit(){
		return suit;
	} 

	public boolean getFacedown(){
		return facedown;
	}
	
	public String getcolor(){
		if(getsuit().equals("heart") || getsuit().equals("diamond")){
			return "red";
		}
		else {
			return "black";
		}
	}
		
	//Flip in either 1 or two methods that changes facedown to be true/false
	public void flipface(){
		facedown = !facedown;
	} 


 public String toString(){
	 String letter = suit.substring(0,1);
	 if (val == 1){
		 return letter + "A";
	 }
	 else if (val == 11){
		 return letter + "J";
	 }
	 else if (val == 12){
		 return letter + "Q";
	 }
	 else if (val == 13){
		 return letter + "K";
	 }
	 else{
		 return letter + val;
	 }

 }


}