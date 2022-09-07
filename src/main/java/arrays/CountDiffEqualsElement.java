package arrays;

// найти количество разных равных элементов
public class CountDiffEqualsElement {
    public static void main(String[] args) {

        int[] arr = EnterArray.input();
        int count = 0;
        boolean isUnique = true;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]   && isUnique){
                    count ++;
                    isUnique = false;
                }
            }
            if (arr[i] != arr[i+1])
                isUnique = true;
        }

        System.out.println("Count different equals elements: " + count);

    }
}
