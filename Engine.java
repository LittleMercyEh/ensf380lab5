package edu.ucalgary.oop;

public class Engine{
    private string EngineType;

    public Engine(String engineType) {
        this.engineType = engineType;
    }

    public Engine(Engine other){
        this.EngineType = other.EngineType;
    }

    public string getEngineType(){
        return engineType;
    }

    public void setEngineType(string engineType){
        this.engineType = engineType;
    }
}