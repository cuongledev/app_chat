package com.hstc.lengoccuong.chatapp.Model;

public class Chat {

    private String sender;
    private String receive;
    private String message;
    private boolean isseen;

    public Chat(String sender, String receive, String message,boolean isseen) {
        this.sender = sender;
        this.receive = receive;
        this.message = message;
        this.isseen = isseen;
    }

    public Chat() {

    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceive() {
        return receive;
    }

    public void setReceive(String receive) {
        this.receive = receive;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isIsseen() {
        return isseen;
    }


    public void setIsseen(boolean isseen) {
        this.isseen = isseen;
    }
}
