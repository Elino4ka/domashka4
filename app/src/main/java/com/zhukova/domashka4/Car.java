package com.zhukova.domashka4;

public class Car {
    private String transmissionType;
    private int enginePower;
    private double currentSpeed;

    public Car(String initTransType, int initEngPower, double initCurrentSpeed){
        transmissionType = initTransType;
        enginePower = initEngPower;
        currentSpeed = initCurrentSpeed;
    }

    public String getTransmissionType(){
        return transmissionType;
    }

    public int getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public void setTransmissionType(String newType){
        transmissionType = newType;
    }

    public void setEnginePower(int newEnginePower){
        enginePower = newEnginePower;
    }

    public void setCurrentSpeed(double newCurrentSpeed){
        currentSpeed = newCurrentSpeed;
    }
    public void changeSpeed(double addedSpeed){
        currentSpeed = currentSpeed + addedSpeed;
    }
}
