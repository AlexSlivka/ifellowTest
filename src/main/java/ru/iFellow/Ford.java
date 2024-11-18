package ru.iFellow;

public class Ford extends Car {

    public Ford(String modelName, String color, String bodyType, int yearOfManufacture, String gearbox, int carMileage, int price) {
        super(modelName, color, bodyType, yearOfManufacture, gearbox, carMileage, price);
    }

    @Override
    public void getCompleteInformationCar() {
        System.out.println("Ford");
        super.getCompleteInformationCar();

    }

}
