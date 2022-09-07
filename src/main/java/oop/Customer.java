package oop;

import java.util.Scanner;

//1. Создать класс сustomer c полями id: фамилия, имя, дата рождения и номер телефона.
//2. Написать метод в классе customer, который принимает с клавиатуры номер телефона
// и принимает в качестве аргумента объект типа customer.
// Нужно проверить совпадает ли номер телефона у переданного объекта и введенный.

//Добавить в класс Customer поле: адрес, состоящий из номера дома и улицы.
// Написать метод, который просит ввести адрес с клавиатуры и проверяет,
// совпадают ли введённый адрес и адрес объекта.
public class Customer {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private Adress adress;
    private String phone;

    private Order order;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public static boolean equalsPhone(Customer customer) {
        String phone;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter phone:");
        phone = sc.nextLine();
        sc.close();

        return phone.equals(customer.phone);
    }

    public static boolean equalsAdress(Customer customer) {
        String street;
        String house;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название улицы");
        street = sc.nextLine();
        System.out.println("Введите номер дома");
        house = sc.nextLine();
        sc.close();

        return street.equals(customer.adress.getStreet()) && house.equals(customer.adress.getHouse());
    }

    public boolean equalsOrder(Order order){

        return order.getAdress().equals(this.adress);
    }

}
