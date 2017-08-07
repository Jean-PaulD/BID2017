package domain;

import java.util.Date;
import java.util.Timer;

/**
 * Created by Jean-Paul D on 2017-08-07.
 */
public class Bid     {


    private String bidId;
    private String username;
    private String itemID;
    private Timer bidTimer;

    private Bid(){}

    public Bid(Builder builder) {
        this.bidId = builder.bidId;
        this.username = builder.username;
        this.itemID = builder.itemID;
        this.bidTimer = builder.bidTimer;
    }

    public static class Builder{


        private String bidId;
        private String username;
        private String itemID;
        private Timer bidTimer;

        public Builder bidId(String value){
            this.bidId = value;
            return this;
        }

        public Builder username(String value){
            this.username = value;
            return this;
        }

        public Builder itemID(String value){
            this.itemID = value;
            return this;
        }

        public Builder bidTimer(Timer value){
            this.bidTimer = value;
            return this;
        }

        public Bid build(){
            return new Bid(this);
        }
    }




    public String getBidId() {
        return bidId;
    }

    public String getUsername() {
        return username;
    }

    public String getItemID() {
        return itemID;
    }

    public Timer getBidTimer() {
        return bidTimer;
    }



}
