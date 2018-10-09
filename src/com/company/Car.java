package com.company;

public class Car {
    private String brandName,model,gearType,colour;
    private String status;
    private int pricePerDay;

    public Car(String brandName, String model, String gearType, String colour, String status, int pricePerDay) {
        this.brandName = brandName;
        this.model = model;
        this.gearType = gearType;
        this.colour = colour;
        this.status = status;
        this.pricePerDay = pricePerDay;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModel() {
        return model;
    }

    public String getGearType() {
        return gearType;
    }

    public String getColour() {
        return colour;
    }

    public String getStatus() {
        return status;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return  "brandName='" + brandName + '\'' +
                ", model='" + model + '\'' +
                ", gearType='" + gearType + '\'' +
                ", colour='" + colour + '\'' +
                ", status='" + status + '\'' +
                ", pricePerDay=" + pricePerDay +
                '}';
    }
}
