package ru.iFellow;

public class Kia extends Car {

    public Kia(String modelName, String color, String bodyType, int yearOfManufacture, String gearbox, int carMileage, int price) {
        super(modelName, color, bodyType, yearOfManufacture, gearbox, carMileage, price);
    }

    @Override
    public void getCompleteInformationCar() {
        System.out.println("Kia");
        super.getCompleteInformationCar();
    }

}
