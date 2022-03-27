package com.company;

public class Shark  extends  Animal{
    private String color;

    public Shark(String color) {

        this.color = color;
    }

    public Shark() {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public  void attack(){
        System.out.println("attack");

    }
}
