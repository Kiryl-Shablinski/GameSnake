package arrays;

public class MinEvenElement {
    public static void main(String[] args) {
        /* Для ввода данных в массив я создал отдельный класс и в нем статический метод.
        Чтобы каждый раз не писать один и тот же код.
        public class EnterArray {
            public static int[] input(){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter array's size: ");
                int[] arr = new int[sc.nextInt()];

                for (int i = 0; i < arr.length; i++){
                    System.out.print("Enter array's element: ");
                    arr[i] = sc.nextInt();
                }
                sc.close();
                return arr;
            }
        }
       */
        int[] arr = EnterArray.input();
        int minEven = minEvenElement(arr);

        double[] resultArray = new double[arr.length];

        for (int i = 0; i < resultArray.length; i++){
            resultArray[i] =(double) arr[i] / minEven;
            System.out.print(resultArray[i] + " ");
        }
    }
    public static int minEvenElement (int[] arr){
        int min  = Integer.MAX_VALUE;
        boolean isMinEvenElem = false;
         for (int i = 0; i < arr.length; i++){
             if (arr[i] < min && arr[i] % 2 == 0 ){
                 min = arr[i];
                 isMinEvenElem = true;
             }
         }
         if (!isMinEvenElem) {
             System.out.println("Array haven't even element");
             System.exit(1);
         }
        return min;
    }
}
