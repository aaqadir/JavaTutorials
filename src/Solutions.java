import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Solutions {

    void findMultiplOfFive() {
        int num = 63, n = 5;

        float a = (num + n - 1) * n;
        float b = num + n - 1;
        int c = 7 / 5;
        System.out.println(a + " " + b + " " + c);

        long res = (num + n - 1) / n * n;
        System.out.println(res);
    }

    void formatStringDate() {
        String[] dates = {"20th Oct 2052", "6th Jun 1933", "26th May 1960", "20th Sep 1958", "16th Mar 2068", "25th May 1912",
                "16th Dec 2018", "26th Dec 2061", "4th Nov 2030", "28th Jul 1963"};

        HashMap<String, String> month = new HashMap<>();
        month.put("Jan", "01");
        month.put("Feb", "02");
        month.put("Mar", "03");
        month.put("Apr", "04");
        month.put("May", "05");
        month.put("Jun", "06");
        month.put("Jul", "07");
        month.put("Aug", "08");
        month.put("Sep", "09");
        month.put("Oct", "10");
        month.put("Nov", "11");
        month.put("Dec", "12");

        System.out.println(month.get("Jan"));


        for (String str : dates) {

            List<String> partDate = List.of(str.split(" "));
            String yer = partDate.get(2);
            String mon = month.get(partDate.get(1));

            String d = partDate.get(0);
            String day = d.substring(0, d.length() - 2);
            String apDay = String.format("%02d", Integer.valueOf(day));

            System.out.println(yer + "-" + mon + "-" + apDay);
        }
    }

    List<Integer> allPrimeInRange(int numEnd) {
        List<Integer> res = new ArrayList<>();

        for (int i = 2; i <= numEnd; i++) {
            if (isPrimeNum(i)) {
                res.add(i);
            }
        }
        return res;
    }

    boolean isPrimeNum(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // works for both Numbers and string
    boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        String temp = sb.reverse().toString();
        System.out.println("rev String: " + temp);
        return str.equals(temp);
    }

    void exArrayList() {
//        ArrayList<String> al = new ArrayList<String>();
//        al.add("Mango");
//        al.add("Apple");
//        al.add("Banana");
//        al.add("Grapes");

        String[] top11Templates = new String[]{"TEMPLATE_1", "TEMPLATE_2", "TEMPLATE_3", "TEMPLATE_4", "TEMPLATE_5",
                "TEMPLATE_6", "TEMPLATE_7", "TEMPLATE_8", "TEMPLATE_9", "TEMPLATE_10", "TEMPLATE_11"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(top11Templates));

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Group ID :: " + list.get(i));
        }
    }

    void printStarPattern() {
        int row = 4, column = 4;
        for (int i = 0; i < row; i++) {
            for (int j = row - 1; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println(" ");
        }
    }

    void streamFilter() {
        List<Integer> nums = Arrays.asList(1, 5, 7, 9, 6, 4, 9, 1, 465, 5, 45, 454, 94, 61, 44, 6);

        List<Integer> odd = nums.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());

        System.out.println(odd);
    }

    public int kthFactor() {
        List<Integer> factors = new ArrayList<>();
        int result = -1, n = 7, k = 2;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);
            }
        }
        System.out.println(factors);
        System.out.println(factors.size());
        if (factors.size() >= k) {
            result = factors.get(k - 1);
        }
        System.out.println(result);
        return result;
    }

    public void checkingJdk17() {
        String value = "Multi-line"
                + "\n" // line separator
                + "Text"
                + "\n";
        String str = "Multi-line\nText\n";

        String value17 = """
                Multi-line
                Text
                """;

        System.out.println(value);
        System.out.println(str);
    }

    public void superSubString() {
        String s = "aaabccdddzzzzaaaccc";
        String s2 = "aa";
        String s3 = "baab";
        String regex = "([a-z])\\1";
        String result = "";
        do {
            result = s.replaceFirst(regex, "");
            s = result.replaceFirst(regex, "");
        } while (!result.equals(s));

        if (result.isEmpty()) {
            result = "Empty String";
        }
        //return result;
        System.out.println("res: " + result);
    }

    public void marsExploration() {
        String msg = "SOS", res = "", inStr = "SOSTOT";
        int count = 0;
        int msgCount = inStr.length() / 3;
        System.out.println(msgCount);
        while (msgCount > 0) {
            res = res + msg;
            msgCount--;

        }
        System.out.println(res);

        for (int i = 0; i < inStr.length(); i++) {
            if (inStr.charAt(i) != res.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
        //return count;
    }

    public void hackerrankInString() {
        String inStr="hereiamstackerrank";
        String inStr2="hackerworld";
        String teststr = "hackerrank";
        //List<Character> charList = new ArrayList<>();
        char[] charList = inStr2.toCharArray();
        int i = 0;
        for (char c : charList) {
            if (i < teststr.length() && c == teststr.charAt(i)) {
                i++;
            }
            System.out.println(i);
        }
        if (i == 10) {
            System.out.println("YES");
        }
        System.out.println("NO");
    }
}
