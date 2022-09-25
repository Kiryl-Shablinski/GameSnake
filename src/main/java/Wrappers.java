


import java.util.Scanner;
//Используя консольный ввод, создайте несколько строк,
// с помощью метода parseInt() приведите их к целочисленному типу данных.
// Если строка не может быть приведена к целому числу, выведите на экран “Not valid”.
//2. Создайте по одному экземпляру примитивных типов данных. Затем, используя метод valueOf(),
// из этих экземпляров получите обёртки.

public class Wrappers {
    public static void main(String[] args) {
        //можно обернуть ввод в блок try catch recourse
    /*    try(Scanner sc = new Scanner(System.in)){
            int a = Integer.parseInt(sc.nextLine());
            System.out.println(a);
            int b = Integer.parseInt(sc.nextLine());
            System.out.println(b);
        }catch (NumberFormatException  e){
            System.out.println("Not Valid");
        }
     */

       Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if (parser(a))
            System.out.println(a);
        else {
            System.out.println("Not valid");
        }
        wrappers();
    }

    public static boolean parser(String s){
       boolean isDigit = false;
        if (s.length() == 0) return false;
        char[] ch = s.toCharArray();
        if (ch[0] == '-' && ch.length == 1) return false;
        if (ch[0] == '.') return  false;
        boolean point = false;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == '-' && i == 0) {
                continue;
            }
            if (ch[i] == '.' && !point) {
                point = true;
                continue;
            }else if(ch[i] == '.' && point){
                return false;
            }
            if (Character.isDigit(ch[i]))
              isDigit = true;
        }
        return isDigit;
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
