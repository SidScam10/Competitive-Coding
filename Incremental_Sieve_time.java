import java.util.*;

public class Incremental_Sieve_time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time limit in seconds: ");
        long timeLimitInSeconds = sc.nextLong();  // Time limit in seconds
        long timeLimitInMillis = timeLimitInSeconds * 1000;  // Convert to milliseconds

        long startTime = System.currentTimeMillis();
        ArrayList<Integer> primes = new ArrayList<>();
        ArrayList<Integer> odd_composites = new ArrayList<>();
        primes.add(2);
        int nextNum = 3;

        while (true) {
            if (System.currentTimeMillis() - startTime > timeLimitInMillis) {
                break;
            }

            boolean isPrime = true;
            for (int prime : primes) {
                if (prime > Math.sqrt(nextNum)) {
                    break;
                }
                if (nextNum % prime == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes.add(nextNum);
                for (int i = nextNum * nextNum; i <= Integer.MAX_VALUE && i < nextNum + timeLimitInMillis; i += 2 * nextNum) {
                    odd_composites.add(i);
                }
            }

            nextNum += 2;  // Increment by 2 to skip even numbers
        }

        System.out.println(primes);
        System.out.println(odd_composites);

        sc.close();
    }
}
