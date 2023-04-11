package it.unibo.sweng.simplegwt.shared;

public class Possesso {
    private Card possessedCard;
    private int conditions;
    private String possessedCardDescription;
    private User userOfPossession;
    
    public Possesso(){
		
	}
    
    public Possesso(Card possessedCard, int conditions, String possessedCardDescription, User userOfPossession) {
        this.possessedCard = possessedCard;
        this.conditions = conditions;
        this.possessedCardDescription = possessedCardDescription;
        this.userOfPossession = userOfPossession;
    }
    
    // metodi getter e setter per ogni variabile
    
    public Card getPossessedCard() {
        return possessedCard;
    }
    
    public void setPossessedCard(Card possessedCard) {
        this.possessedCard = possessedCard;
    }
    
    public int getConditions() {
        return conditions;
    }
    
    public void setConditions(int conditions) {
        this.conditions = conditions;
    }
    
    public String getPossessedCardDescription() {
        return possessedCardDescription;
    }
    
    public void setPossessedCardDescription(String possessedCardDescription) {
        this.possessedCardDescription = possessedCardDescription;
    }
    
    public User getUserOfPossession() {
        return userOfPossession;
    }
    
    public void setUserOfPossession(User userOfPossession) {
        this.userOfPossession = userOfPossession;
    }
}