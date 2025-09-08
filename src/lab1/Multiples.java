package lab1;

public class Multiples {
    public static void main(String[] args) {
        int num = multiples();
        System.out.println(num);
    }

    private static int multiples() {
        int num = 0;
        for  (int i = 1; i <= 1000; i++) {if (i % 3 == 0 || i % 5 == 0){num++;}}
        return num;
    }
}
