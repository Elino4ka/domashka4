public class Car {
    private string transmissionType;
    private int enginePower;
    private double currentSpeed;

    public Car(string initTransType, int initEngPower, double initCurrentSpeed){
        transmissionType = initTransType;
        enginePower = initEngPower;
        currentSpeed = initCurrentSpeed;
    }

    public string getTransmissionType(){
        return transmissionType;
    }

    public int getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public void setTransmissionType(string newType){
         transmissionType = newType;
    }

    public void setEnginePower(int newEnginePower){
        enginePower = newEnginePower;
    }

    public void setCurrentSpeed(double newCurrentSpeed){
        currentSpeed = newCurrentSpeed;
    }

}
