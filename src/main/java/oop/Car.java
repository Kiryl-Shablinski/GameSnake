package oop;
//Создать класс «машина» с полями: марка, модель, объём двигателя и год выпуска.
//Переопределить метод equals, который определяет по модели и году выпуска эквивалентны ли две машины.
public class Car {

    private String brand;
    private String model;
    private double engineVolume;
    private int year;


    @Override
    public boolean equals(Object obj) {
       if (obj == null || obj.getClass() != this.getClass()) return false;
       if (obj == this) return true;
       Car car = (Car) obj;

        return model.equals(car.model) && year == car.year;
    }

    public static void main(String[] args) {
        Car car = new Car();
        Car car1  = new Car();
        car.year = 2021;
        car1.year = 2020;
        car.model = "Atlas";
        car1.model = "Atlas";
        System.out.println(car.equals(car1));
    }
}
