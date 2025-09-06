package com.tutorusdude.datatransferobjects.DtoExamples;

public class LaptopDTO {

    private String brand;
    private String colour;
    private int prize;
    private int storage;
    private String operatingSystem;

    public LaptopDTO(String brand, String colour, int prize, int storage, String operatingSystem) {
        this.brand = brand;
        this.colour = colour;
        this.prize = prize;
        this.storage = storage;
        this.operatingSystem = operatingSystem;
    }

    public String grtBrand(){
        return brand;
    }

    public String getColour(){
        return colour;
    }

    public int getPrize(){
        return prize;
    }

    public int getStorage(){
        return storage;
    }

    public String getOperatingSystem(){
        return operatingSystem;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public void setPrize(int prize){
        this.prize = prize;
    }

    public void setStorage(int storage){
        this.storage = storage;
    }

    public void setOperatingSystem(String operatingSystem){
        this.operatingSystem = operatingSystem;
    }

}
