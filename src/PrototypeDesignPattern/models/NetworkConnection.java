package PrototypeDesignPattern.models;

public class NetworkConnection {
    private String ip;
    private String bigData;

    public NetworkConnection(){}


    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getBigData() {
        return bigData;
    }

    public void setBigData(String bigData) {
        this.bigData = bigData;
    }

    public void loadVeryImportantData() throws InterruptedException {
        this.bigData = "Very important data!";
        Thread.sleep(5000);
    }
}
