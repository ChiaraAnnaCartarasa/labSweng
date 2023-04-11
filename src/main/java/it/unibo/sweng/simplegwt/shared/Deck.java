package it.unibo.sweng.simplegwt.shared;
import java.util.ArrayList;

public class Deck {

	private User userOwner; 
	private int cardID; 
	ArrayList<Card> cardList = new ArrayList<Card>();
	
	public Deck(){
		
	}
	
	public Deck (User userOwner, int cardID, ArrayList<Card> cardList) {
		this.userOwner = userOwner;
		this.cardID = cardID;
		this.cardList = cardList;
	}
	
	
	public User getUser() {
		return this.userOwner;
	}
	
	public int cardID() {
		return this.cardID;
	}
	
	public ArrayList<Card> cardList() {
		return this.cardList;
	}
}


	