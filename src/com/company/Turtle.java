package com.company;

public class Turtle extends Animal{
    private String color;


    public Turtle(String color) {
        this.color = color;
    }
    public Turtle(){

    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void swim(){
        System.out.println("swim");

    }
}
