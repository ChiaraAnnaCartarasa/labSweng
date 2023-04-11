package it.unibo.sweng.simplegwt.shared;

public class RichiestaScambio {
    private User fromUser;
    private User toUser;
    private Card requestCard;
    private Card offeredCard;
    private boolean status;
    private int requestID;
    
    public RichiestaScambio() {
    	
    }

    public RichiestaScambio(User fromUser, User toUser, Card requestCard, Card offeredCard, boolean status, int requestID) {
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.requestCard = requestCard;
        this.offeredCard = offeredCard;
        this.status = status;
        this.requestID = requestID;
    }

    // getters and setters
    public User getFromUser() {
        return fromUser;
    }

    public void setFromUser(User fromUser) {
        this.fromUser = fromUser;
    }

    public User getToUser() {
        return toUser;
    }

    public void setToUser(User toUser) {
        this.toUser = toUser;
    }

    public Card getRequestCard() {
        return requestCard;
    }

    public void setRequestCard(Card requestCard) {
        this.requestCard = requestCard;
    }

    public Card getOfferedCard() {
        return offeredCard;
    }

    public void setOfferedCard(Card offeredCard) {
        this.offeredCard = offeredCard;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }
