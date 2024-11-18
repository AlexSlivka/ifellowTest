package ru.iFellow;

public class Toyota extends Car {

    public Toyota(String modelName, String color, String bodyType, int yearOfManufacture, String gearbox, int carMileage, int price) {
        super(modelName, color, bodyType, yearOfManufacture, gearbox, carMileage, price);
    }

    @Override
    public void getCompleteInformationCar() {
        System.out.println("Toyota");
        super.getCompleteInformationCar();
    }

}
