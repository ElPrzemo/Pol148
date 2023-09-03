package org.example.homework;

public class GearBox {
    private String producer;
    private int price;

    private String gearType;



    public GearBox() {
    }

    public GearBox(String producer, int price, String gearType) {
        this.producer = producer;
        this.price = price;
        this.gearType = gearType;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public String getGearType() {
        return gearType;
    }

    @Override
    public String toString() {
        return "GearBox{" +
                "producer='" + producer + '\'' +
                ", price=" + price +
                ", gearType='" + gearType + '\'' +
                '}';
    }
}
