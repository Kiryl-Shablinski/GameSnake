package oop.bird;

public class Chaffinch implements Bird{

    @Override
    public void sitDown() {
        System.out.println("Зяблик садится");
    }

    @Override
    public void takeOff() {
        System.out.println("Зяблик взлетает");
    }
}
