package oop.bird;

public class Swallow implements Bird{
    @Override
    public void sitDown() {
        System.out.println("Ласточка садится");
    }

    @Override
    public void takeOff() {
        System.out.println("Ласточка взлетает");
    }
}
