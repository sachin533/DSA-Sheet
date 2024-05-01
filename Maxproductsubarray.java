public class Maxproductsubarray {
    public static void maxproduct(int arr[]) {
        int cumpro = 0;
        int Maxpro = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;

            for (int j = i; j < arr.length; j++) {
                int end = j;
                cumpro = 0;

                for (int k = start; k <= end; k++) {
                    cumpro *= arr[k];
                }

                if (cumpro > Maxpro) {
                    Maxpro = cumpro;
                }
            }
        }
        System.out.println("Maximum product subarray is: " + Maxpro);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, -2, 4 };

        maxproduct(arr);
    }

}
