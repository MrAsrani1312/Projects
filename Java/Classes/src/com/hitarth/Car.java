package com.hitarth;

public class Car {
    private String model;

    public void InputModel(String model)
    {
        this.model = model;
    }
    public void Disp(){
        System.out.println("The car model is : "+model);
    }
}
