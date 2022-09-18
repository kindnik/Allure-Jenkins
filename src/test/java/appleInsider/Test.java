package appleInsider;

public class Test {
    public static void main(String[] args) {
        int n = 1000;

        result:
        for (int i = 2; i <= n; i++) { // Для всех i...

            for (int j = 2; j < i; j++) { // проверить, делится ли число..
                if (i % j == 0) continue result; // не подходит, берём следующее
            }
            System.out.println(i);
        }
    }
}

