package domain;

/**
 * Created by Jean-Paul D on 2017-08-07.
 */
public class CommentBid {

    private String id;
    private String itemId;
    private String username;
    private String comment;

    private CommentBid(){}

    public CommentBid(Builder builder) {
        this.id = builder.id;
        this.itemId = builder.itemId;
        this.username = builder.username;
        this.comment = builder.comment;
    }

    public static class Builder{


        private String id;
        private String itemId;
        private String username;
        private String comment;

        public Builder id(String value){
            this.id = value;
            return this;
        }

        public Builder itemId(String value){
            this.itemId = value;
            return this;
        }

        public Builder username(String value){
            this.username = value;
            return this;
        }

        public Builder comment(String value){
            this.comment = value;
            return this;
        }

        public CommentBid build(){
            return new CommentBid(this);
        }
    }



    public String getId() {
        return id;
    }

    public String getItemId() {
        return itemId;
    }

    public String getUsername() {
        return username;
    }

    public String getComment() {
        return comment;
    }



}
