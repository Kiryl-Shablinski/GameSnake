package oop;


import oop.bird.Bird;
import oop.bird.Chaffinch;
import oop.bird.Swallow;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kiryl", "Shablinski", 4, 5, 5, 5, 4, 4, 5, 4, 5, 5);

     //   student.gradPoint();

        /*Customer customer = new Customer();
        Order order = new Order();
        customer.setAdress(new Adress("Tavlaya", "62"));
        order.setAdress(new Adress("Tavlaya", "61"));

        System.out.println(Customer.equalsAdress(customer));
        System.out.println(customer.equalsOrder(order));


        Bird chaffinch = new Chaffinch();
        Swallow swallow = new Swallow();
        chaffinch.sitDown();
        chaffinch.takeOff();
        swallow.sitDown();
        swallow.takeOff();
        */
        String[] ints = {"", null};
        System.out.println(ints.length);
    }
}
