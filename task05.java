import java.util.Scanner;

class task05 {
    public static void main(String args[]) {

        int i, t;
        int arr[] = new int[6];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 6 numbers:");

        for (i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }

        i = 0;
        while (i < 6 - 1) {
            t = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = t;
            i = i + 2;
        }

        System.out.print("After swap list are:");
        for (i = 0; i < 6; i++) {
            System.out.print(" " + arr[i]);
        }

    }
}