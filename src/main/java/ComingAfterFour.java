
public class ComingAfterFour {

    public static int[] afterFour(int[] array) throws RuntimeException{
        int numFour = -1;
        int[] ret;
        if(array.length == 0){
            throw new RuntimeException("Empty array");
        }else {
            for (int i = 0; i < array.length; i++) {
                if(array[i] == 4){
                    numFour = i + 1;
                }
            }
            if(numFour == -1){
                throw new RuntimeException("Array has not value of 4");
            }else{
                int size = array.length - numFour;
                ret = new int[size];
                for (int i = 0; i < size; i++) {
                    ret[i] = array[numFour + i];
                }
            }
        }
        return ret;
    }

    public static boolean arrayHaveOnlyOneAndFour(int[] a){
        boolean isOne = false;
        boolean isFour = false;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 1){
                isOne = true;
            }else if(a[i] == 4){
                isFour = true;
            }else return false;
        }
        return isFour && isOne;
    }

    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }
}
