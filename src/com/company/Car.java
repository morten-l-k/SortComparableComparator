package com.company;

public class Car implements Comparable<Car>{
  //Comparable er også et interface
  private String model;
  private String brand;
  private FuelType fuelType;
  private Integer age;

  public Car(String model, String brand, FuelType fuelType, int age){
    this.model = model;
    this.brand = brand;
    this.fuelType = fuelType;
    this.age = age;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public FuelType getFuelType() {
    return fuelType;
  }

  public void setFuelType(FuelType fuelType) {
    this.fuelType = fuelType;
  }

  @Override
  public String toString() {
    return "Car{" +
        "model='" + model + '\'' +
        ", brand='" + brand + '\'' +
        ", fuelType=" + fuelType + '\'' +
        ", age= " + age +
        '}';
  }

  @Override
  public int compareTo(Car o) {
    return this.model.compareTo(o.model);//Her vælger vi at sortere på model-attributen. Vi kunne også udskifte model med brand, og så ville den ovre i Main sortere på brand fremfor model.
  }
  //Comparable sorterer kun på natural order. Natural order er, at den sorteres fra fx A til Å.
  //Vi kan ikke umiddelbart lave nogle customized sorteringer med comparable.

}
