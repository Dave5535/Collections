package org.example;

import java.util.Objects;

public class Car {
    private int sequencer =0;
    private int id;
    private String brand;
    private String model;
public Car(){
    this.id = (sequencer++);
}
    public Car( String brand,String model) {
    this();
        setBrand(brand);
        setModel(model);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return sequencer == car.sequencer && id == car.id && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sequencer, id, brand, model);
    }
}
