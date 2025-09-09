package lab1;

public class Multiples {
    public static void main(String[] args) {
        int num = multiples(1000, 4, 4);
        System.out.println(num);
    }

    public static int multiples(int n, int a, int b) {
        int num = 0;
        for  (int i = 1; i < n; i++) {if (i % a == 0 || i % b == 0){num++;}}
        return num;
    }
}