package exercises;

public class Array {
    public static void main(String[] args) {
        int[] someInts = {1, 1, 2, 3, 5, 8};
        for (int i : someInts) {
            System.out.println(i);

            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
