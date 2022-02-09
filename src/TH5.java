public class TH5 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int min = minValue(array);
        System.out.println("The smallest element in the array is: " + array[min]);
    }


    public static int minValue(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            }

        }return min;
    }

}



