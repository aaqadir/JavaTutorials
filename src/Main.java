import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Solutions sol = new Solutions();



        //1. format string date = 20th Oct 2052 to DD-MM-YYYY
        sol.formatStringDate();

        //2. check if the string given is palindrome or not
        Boolean resPalindrome = sol.isPalindrome("4441");
        System.out.println(resPalindrome);

        //3. check if the given number is prime or not.
        Boolean resPrime = sol.isPrimeNum(98);
        System.out.println(resPrime);

        //4. return all prime in given range 0 to n
        List<Integer> resPrimeRange = sol.allPrimeInRange(120);
        System.out.println(resPrimeRange);

        //5. find all multiple of 5
        sol.findMultiplOfFive();

        //6. print all elements from array
        sol.exArrayList();

        //7. print a pattern
        sol.printStarPattern();

        //8. filter to find even no
        sol.streamFilter();

        //9. find kth factor
        int factor = sol.kthFactor();
        System.out.println(factor);

        //10. jdk17 multiline text block
        sol.checkingJdk17();

        //11. find substring with no repeating adjacent char
        sol.superSubString();
    }
}