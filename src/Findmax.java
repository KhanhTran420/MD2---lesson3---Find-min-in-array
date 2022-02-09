public class Findmax {
    public static int Maxvalue (int[] array){
        int max = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i]>array[max]){
                max = i;
            }
        }
        return max;

    }


    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        int max = Maxvalue(array);
        System.out.println("The biggest element in the array is: " + array[max]);
    }
}
