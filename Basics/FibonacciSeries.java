import java.util.HashMap;


public class FibonacciSeries {
    private static HashMap<Integer, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        //0, 1, 2, 3, 4, 5, 6,  7,  8,  9, 10,
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

        System.out.println();
        System.out.println(fibMemo(1000));

    }

    // solving the problem recursively
    private static long fib(int num) {
        //case number was zero the Fibonacci number is 0
        if (num == 0L) return 0L;
            //case number is 1 or 2 the Fibonacci number is 1 for both cases
        else if (num == 1L || num == 2L) return 1;
        // solving the problem recursively
        return fib(num - 1) + fib(num - 2);
    }

    // solving the problem recursively with the use of memo to save run time
    private static long fibMemo(int num) {
        //case number was zero the Fibonacci number is 0
        if (num == 0) return 0L;
            //case number is 1 or 2 the Fibonacci number is 1 for both cases
        else if (num == 1 || num == 2) return 1;
            // if the HashMap have the result already return the resilt
            //else calculate it and store it in the HashMap
        else if (memo.containsKey(num)) return memo.get(num);
        else {
            long result = fibMemo(num - 1) + fibMemo(num - 2);
            memo.put(num, result);
            return result;
        }

    }
}
