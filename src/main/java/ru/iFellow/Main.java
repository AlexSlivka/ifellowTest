package ru.iFellow;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //its Main origin
    public static void main(String[] args) {
        System.out.println("Hello");

        List<Car> carList = new ArrayList<>();
        carList.add(new Skoda("Octavia", "зеленый", "лифтбек",
                1999, "автомат", 100000, 5000));
        carList.add(new Skoda("Rapid", "синий", "лифтбек",
                2015, "автомат", 15000, 9000));
        carList.add(new Ford("Focus", "белый", "хэтчбек",
                2009, "механика", 120000, 3000));
        carList.add(new Ford("Transit", "красный", "фургон",
                2017, "автомат", 11000, 3000));
        carList.add(new Kia("Rio", "белый", "седан",
                2015, "механика", 30000, 15000));
        carList.add(new Kia("Cerato", "черный", "седан",
                2016, "автомат", 33000, 19000));
        carList.add(new Mercedes("Mercedes-Benz CLS", "черный", "седан",
                2019, "автомат", 23000, 53000));
        carList.add(new Mercedes("Mercedes-Benz CLA", "белый", "седан",
                2021, "автомат", 20000, 51000));
        carList.add(new Toyota("Corolla", "серый", "седан",
                2005, "механика", 230000, 16000));
        carList.add(new Toyota("Camry", "зеленый", "седан",
                2017, "автомат", 45000, 21000));

        System.out.println("\n Исходные данные");
        for (Car i : carList) {
            i.getCompleteInformationCar();
        }

        bringOutFreshCars(carList);
        repaintTheCar(carList);
        getCarOfBodyType(carList, "седан");
    }

    public static void bringOutFreshCars(List<Car> carListToFresh) {
        System.out.println("\n Машины, выпущенные после 2006 года");
        for (Car car : carListToFresh) {
            if (car.yearOfManufacture > 2006) {
                car.getCompleteInformationCar();
            } else {
                System.out.println("Устаревший авто");
            }
        }
    }

    public static void repaintTheCar(List<Car> carListToRepaint) {
        System.out.println("\n Перекрашиваем зеленые машины в красный цвет");
        for (Car car : carListToRepaint) {
            if (car.getColor().equals("зеленый")) {
                car.setColor("красный");
            }
            car.getCompleteInformationCar();
        }
    }

    public static void getCarOfBodyType(List<Car> carListToBodyType, String body) {
        System.out.println("\n Машины в кузове " + body);
        boolean bodyCar = false;
        for (Car car : carListToBodyType) {
            if (car.bodyType.equals(body)) {
                car.getCompleteInformationCar();
                bodyCar = true;
            }
        }
        if (!bodyCar) {
            System.out.println("Нет таких автомобилей");
        }
    }

}