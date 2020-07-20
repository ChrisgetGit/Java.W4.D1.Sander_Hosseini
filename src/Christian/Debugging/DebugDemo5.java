package Christian.Debugging;

public class DebugDemo5 {

    public static void main(String[] args) {

        int[] a = {10,16,20,6,1,3,5,25,31,34,7,8,22};
        int[] sorted = sort(a);
        for(int element : sorted) {
            System.out.print(element + " ");
        }


    }

    public static int[] sort(int[] array) {
        int temp = 0;
        for(int i = 1; i < array.length; i++) {
            for(int j = i; j> 0; j--) {
                if(array[j] < array[j-1]) {
                    temp = array[j];
                    array[j] =  array[j-1];
                    array[j-1] = temp;
                }

            }
        }
        return array;
    }
}