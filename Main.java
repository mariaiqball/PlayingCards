public class Main {

    public static void main(String[] args) {
		//Creates Deck
		Deck game = new Deck();
		game.create(); 

		//Shuffles cards
		game.shuffle();
		System.out.println("Shuffled deck");
		game.print();

		//Deals out cards to both players 
		Deck player1 = new Deck();
		Deck player2 = new Deck();
		

		for(int i = 0; i < 26; i++){
			player1.add(game.topCard());
		} 

		for(int i = 0; i < 26; i++){
			player2.add(game.topCard());
		}

		System.out.println("Player 1");
		player1.print();
		System.out.println("Player 2");
		player2.print();
 
		
        //Game Play
		while (player1.size() > 0 && player2.size() > 0){
		    Deck pool = new Deck();
		    Card P1 = player1.topCard();
	        Card P2 = player2.topCard();
		    System.out.println(P1);
		    System.out.println(P2);

		    if (P1.getVal() > P2.getVal()){
			    player1.add(P1);
				player1.add(P2); 
				System.out.println("Player 1");
		        player1.print();
		        System.out.println("Player 2");
		        player2.print();
			}
			else if (P1.getVal() < P2.getVal()){
				player2.add(P1);
				player2.add(P2);
				System.out.println("Player 1");
		        player1.print();
		        System.out.println("Player 2");
		        player2.print();
			} 
			else{
				while (P1.getVal() == P2.getVal()){
					if (player1.size() < 4){
						System.out.println("Player 2 won!!");
                        return;
                    }
					if (player2.size() < 4){
						System.out.println("Player 1 won!!");
                        return;
                    }
					pool.add(P1);
			        pool.add(P2);

					for (int i = 0; i < 3; i++){
						pool.add(player1.topCard()); 
						pool.add(player2.topCard());
					} 

					P1 = player1.topCard();
					P2 = player2.topCard();

					if (P1.getVal() > P2.getVal()){
						for(int i = 0; i < pool.size(); i++){
							Card x = pool.getCard(i);
							player1.add(x);
						}
						pool = new Deck();
						player1.add(P1);
						player1.add(P2);
					}

					if (P1.getVal() < P2.getVal()){

						pool = new Deck();
						for(int i = 0; i < pool.size(); i++){
							player2.add(pool.topCard());
						}
						player2.add(P1);
						player2.add(P2);
					} 

					System.out.println("Player 1");
		            player1.print();
		            System.out.println("Player 2");
		            player2.print();
					
				}
			}
		}

		if (player1.size() == 0){
			System.out.println("Player 2 won!");
		}
		if (player2.size() == 0){
			System.out.println("Player 1 won!");
		}
    }

}