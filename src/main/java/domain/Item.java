package domain;

/**
 * Created by Jean-Paul D on 2017-08-07.
 */
public class Item {

    private String itemId;
    private String username;
    private String description;
    private String itemName;
    private double itemValue;
    private String currentBidOwner;
    private String comment;

    private Item(){}

    public Item(Builder builder) {
        this.itemId = builder.itemId;
        this.username = builder.username;
        this.description = builder.description;
        this.itemName = builder.itemName;
        this.itemValue = builder.itemValue;
        this.currentBidOwner = builder.currentBidOwner;
        this.comment = builder.comment;

    }

    public static class Builder{


        private String itemId;
        private String username;
        private String description;
        private String itemName;
        private double itemValue;
        private String currentBidOwner;
        private String comment;




        public Builder itemId(String value){
            this.itemId = value;
            return this;
        }

        public Builder username(String value){
            this.username = value;
            return this;
        }

        public Builder description(String value){
            this.description = value;
            return this;
        }

        public Builder itemName(String value){
            this.itemName = value;
            return this;
        }

        public Builder itemValue(double value){
            this.itemValue = value;
            return this;
        }

        public Builder currentBidOwner(String value){
            this.currentBidOwner = value;
            return this;
        }

        public Builder comment(String value){
            this.comment = value;
            return this;
        }


        public Item build(){
            return new Item(this);
        }
    }



    public String getItemId() {
        return itemId;
    }

    public String getUsername() {
        return username;
    }

    public String getDescription() {
        return description;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemValue() {
        return itemValue;
    }

    public String getCurrentBidOwner() {
        return currentBidOwner;
    }

    public String getComment() {
        return comment;
    }





}
