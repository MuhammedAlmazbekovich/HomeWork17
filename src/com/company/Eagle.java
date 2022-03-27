package com.company;

public class Eagle extends Animal{
    private String color;

    public Eagle(String color) {
        this.color = color;
    }

    public Eagle(){

    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void fly(){
        System.out.println("fly");

    }
}
