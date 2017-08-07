package domain;

/**
 * Created by Jean-Paul D on 2017-08-07.
 */
public class ReportUser {

    private String id;
    private String username;
    private int numberOfReports;

    private ReportUser(){}

    public ReportUser(Builder builder) {
        this.id = builder.id;
        this.username = builder.username;
        this.username = builder.username;
        this.numberOfReports = builder.numberOfReports;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getNumberOfReports() {
        return numberOfReports;
    }

    public static class Builder{

        private String id;
        private String username;
        private int numberOfReports;

        public Builder id(String value){
            this.id = value;
            return this;
        }

        public Builder username(String value){
            this.username = value;
            return this;
        }

        public Builder numberOfReports(int value){
            this.numberOfReports = value;
            return this;
        }

        public ReportUser build(){
            return new ReportUser(this);
        }
    }



}
