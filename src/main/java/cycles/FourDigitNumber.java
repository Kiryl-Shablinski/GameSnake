package cycles;

public class FourDigitNumber {

    public static void main(String[] args) {
      int first,second, third, fourth;

     for (int i = 1000; i < 10000; i ++){
          first = i % 10;
          second = (i / 10) % 10;
          third = (i / 100) % 10;
          fourth = (i / 1000) % 10;

          if ((first + second + third + fourth) == (first * second * third * fourth))
              System.out.println(i);
     }
    }
}
