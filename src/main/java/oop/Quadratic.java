package oop;
//Определить класс «квадратное уравнение» с полями а, б и с - коэффициентами уравнения.
//Написать метод, который возвращает дискриминант.

//Написать в классе «квадратное уравнение» метод, который определяет
// дискриминант больше, либо меньше нуля
// и метод, который считает корни уравнения и записывает их в поле класса.

public class Quadratic {

    private int a;
    private int b;
    private int c;
    private  double discr ;
    private double x1;
    private double x2;


    public Quadratic(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discr = discr(a, b, c);
    }

    public double getDiscr() {
        return discr;
    }

    public double discr(int a, int b, int c){

        return Math.pow(b,2) - 4 * a * c;
    }

    public  void root(double discr){
        if (discr < 0)
            System.out.printf("Equation %dx2 + %dx + %d has no roots%n", a, b, c);

       else if (discr == 0){
           x1 =(double) -b / (2 * a);
           System.out.printf("Equation %dx2 + %dx + %d has one root X = %.2f %n", a, b, c,  x1);
       }
       else {
           x1 =  (-b + Math.sqrt(discr)) / (2 * a);
           x2 =  (-b - Math.sqrt(discr)) / (2 * a);
           System.out.printf("Equation %dx2 + %dx + %d has two roots%n X1 = %.2f %n X2 = %.2f",a, b, c,x1, x2);
        }
    }

    public static void main(String[] args) {
        Quadratic quadratic1 = new Quadratic(3, -4, 2);
        Quadratic quadratic2 = new Quadratic(1, -6, 9);
        Quadratic quadratic3 = new Quadratic(1, -4, -5);
        quadratic1.root(quadratic1.getDiscr());
        quadratic2.root(quadratic2.getDiscr());
        quadratic3.root(quadratic3.getDiscr());
    }
}
