package edu.ucalgary.oop;

public class Car {
    private String model; 
    private Driver driver;
    private Engine engine;

    public Car(Driver driver, Engine engine, String model) {
    this.model = model;
    this.driver = new driver(driver);
    this.engine = new engine(engine);
    }

    public getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = new Model(model);
    }

    public getDriver() {
        return driver;
    }
    public void setDriver(Driver driver) {
        this.driver = new Driver(driver);
    }


    public getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.driver = new Engine(engine);
    }

    }
