import java.util.ArrayList;

public class Task2{
    public static void main(String[] args) {
        primeNumbers();
    }

    public static void primeNumbers() {
        ArrayList <Integer> list = new ArrayList<Integer>();
        for (int i = 2; i <1000; i++) {
            int k = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    k++;
            }
            if (k <= 2)
                list.add(i);

        }
        System.out.println(list);
        
    }
}
