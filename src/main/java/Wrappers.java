


import java.util.Scanner;
//Используя консольный ввод, создайте несколько строк,
// с помощью метода parseInt() приведите их к целочисленному типу данных.
// Если строка не может быть приведена к целому числу, выведите на экран “Not valid”.
//2. Создайте по одному экземпляру примитивных типов данных. Затем, используя метод valueOf(),
// из этих экземпляров получите обёртки.

public class Wrappers {
    public static void main(String[] args) {
        //обернем ввод в блок try catch recourse
        try(Scanner sc = new Scanner(System.in)){
            wrappers();
            int a = Integer.parseInt(sc.nextLine());
            System.out.println(a);
            int b = Integer.parseInt(sc.nextLine());
            System.out.println(b);
        }catch (NumberFormatException  e){
            System.out.println("Not Valid");
        }
    }

    public static void wrappers(){
        byte b = 45;
        short sh = 67;
        int in = 567;
        long ln = 59334;
        float fl = 567.900f;
        double doub = 36.89;
        char ch =  6558;
        boolean boul = false;
        Byte bt = Byte.valueOf(b);
        Short shor = Short.valueOf(sh);
        Integer integer = Integer.valueOf(in);
        Long lng = Long.valueOf(ln);
        Float flt = Float.valueOf(fl);
        Double dou = Double.valueOf(doub);
        Character character = Character.valueOf(ch);
        Boolean bool = Boolean.valueOf(boul);
        System.out.println(bt);
        System.out.println(shor);
        System.out.println(integer);
        System.out.println(lng);
        System.out.println(flt);
        System.out.println(dou);
        System.out.println(character);
        System.out.println(bool);

    }
}
