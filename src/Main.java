import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Solutions sol = new Solutions();

        sol.exArrayList();

        sol.formatStringDate();

        Boolean resPalindrome = sol.isPalindrome("4441");
        System.out.println(resPalindrome);

        Boolean resPrime = sol.isPrimeNum(98);
        System.out.println(resPrime);

        List<Integer> resPrimeRange = sol.allPrimeInRange(120);
        System.out.println(resPrimeRange);

        sol.findMultiplOfFive();
    }
}