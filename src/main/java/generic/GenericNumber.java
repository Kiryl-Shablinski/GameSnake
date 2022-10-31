package generic;

import java.util.Arrays;

//Вам необходимо создать ограниченный обобщённый класс, который может оперировать только числовыми типами данных.
// В классе должен быть метод, который ищет сумму всех элементов в массиве и выводит её в консоль.
public class GenericNumber <T extends Number>{

    public void sumNumber(T [] array){

       double  sum1 = Arrays.stream(array)
                .map(Number::doubleValue)
               .reduce(Double::sum)
               .get();


        System.out.println(sum1);
    }

    public static void main(String[] args) {
        GenericNumber gn = new GenericNumber();
       Integer[] number ={1, 4, 5, 6, 7};
        gn.sumNumber(number);
    }

}
