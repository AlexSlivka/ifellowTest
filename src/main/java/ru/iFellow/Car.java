package ru.iFellow;

public abstract class Car {

    public String modelName;
    private String color;
    public String bodyType;
    public int yearOfManufacture;
    public String gearbox;
    public int carMileage;
    public int price;

    public Car(String modelName, String color, String bodyType, int yearOfManufacture, String gearbox, int carMileage, int price) {
        this.modelName = modelName;
        this.color = color;
        this.bodyType = bodyType;
        this.yearOfManufacture = yearOfManufacture;
        this.gearbox = gearbox;
        this.carMileage = carMileage;
        this.price = price;
    }

    public void getCompleteInformationCar() {
        System.out.printf("Модель = %s, Цвет = %s, Тип кузова = %s, Год выпуска = %d, Коробка передач = %s, Пробег = %d, Цена = %d у.е.\n", modelName, color, bodyType,
                yearOfManufacture, gearbox, carMileage, price);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

}
