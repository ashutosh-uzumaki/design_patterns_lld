package org.ashutosh.builder.bad_design;

public class Car {
    private final String engine;
    private final int wheels;
    private boolean sunroof;
    private boolean airbag;

    public Car(String engine, int wheels){
        this.engine = engine;
        this.wheels = wheels;
    }

    //now one can have airbag other won't. one can have sunroof other won't so there will be 2^n combinations
    public Car(String engine, int wheels, boolean sunroof){
        this.engine = engine;
        this.wheels = wheels;
        this.sunroof = sunroof;
    }

    public Car (String engine, int wheels, boolean sunroof, boolean airbag){
        this.engine = engine;
        this.wheels = wheels;
        this.sunroof = sunroof;
        this.airbag = airbag;
    }

    @Override
    public String toString(){
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", sunroof=" + sunroof +
                ", airbag=" + airbag +
                '}';
    }

}
