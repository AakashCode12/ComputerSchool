import java.util.*;

class grades {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks:");
        int n = sc.nextInt();

        if (n < 25) {
            System.out.println("F");
        } else if (n >= 25 && n < 45) {
            System.out.println("E");
        } else if (n >= 45 && n < 50) {
            System.out.println("D");
        } else if (n >= 50 && n < 60) {
            System.out.println("C");
        } else if (n >= 60 && n < 80) {
            System.out.println("B");
        } else if (n >= 80) {
            System.out.println("A");
        }
        sc.close();
    }
}