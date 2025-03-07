package com.example.charging_station_app;

public class MessageModel {

    // string to store our message and sender
    private String message;
    private String sender;

    public MessageModel(String message, String sender) {
        this.message = message;
        this.sender = sender;
    }

    public MessageModel() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
