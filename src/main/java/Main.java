
public class Main {
    public static void main(String[] args) {
        try {
            ComingAfterFour.printArray(ComingAfterFour
                    .afterFour(new int[]{1,4,6,9}));
        }catch(RuntimeException e){
            System.out.println("Illegal array for function");
        }

        System.out.println();
        System.out.println(ComingAfterFour.arrayHaveOnlyOneAndFour(
                new int[]{1,1,4,1,4,1,1}
        ));
    }
}
