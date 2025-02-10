package org.ashutosh.builder.good_design;

public class Car {
    private final String engine;
    private final int wheels;
    private final boolean sportsMode;
    private final boolean cityDrive;
    private final boolean sunroof;

    private Car(CarBuilder builder){
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.sportsMode = builder.sportsMode;
        this.cityDrive = builder.cityDrive;
        this.sunroof = builder.sunroof;
    }

    public static class CarBuilder{
        private final String engine;
        private final int wheels;
        private boolean sportsMode;
        private boolean cityDrive;
        private boolean sunroof;

        public CarBuilder(String engine, int wheels){
            this.engine = engine;
            this.wheels = wheels;
        }

        public CarBuilder setSunroof(boolean sunroof){
            this.sunroof = sunroof;
            return this;
        }
        public CarBuilder setSportsMode(boolean sportsMode){
            this.sportsMode = sportsMode;
            return this;
        }

        public CarBuilder setCityDrive(boolean cityDrive){
            this.cityDrive = cityDrive;
            return this;
        }

        public Car build(){
            return new Car(this);
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", sportsMode=" + sportsMode +
                ", cityDrive=" + cityDrive +
                ", sunroof=" + sunroof +
                '}';
    }
}
