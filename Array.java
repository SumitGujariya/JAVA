public class Array {
    public static void main(String[] args) {
        int[] integer_array = { 1, 2, 3, 4, 5 };
        System.out.println(integer_array[0]);
        System.out.println(integer_array[1]);
        System.out.println(integer_array[3]);

        System.out.println("output using loop");
        for (int i = 0; i < integer_array.length; i++) {
            System.out.println(integer_array[i]);
        }

        int[][] two_d_array = {
                { 0, 2, 4, 6 },
                { 3, 5, 7, 9 }
        };

        System.out.println("output of two dimensional array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(two_d_array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
