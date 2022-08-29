package StreamClassLearning;

public class Test {
    public static void main(String[] arr) {
        String str1 = "abcdefg";
        String str2 = leftrotate(str1, 2);
        System.out.println(str2);
        System.out.println(rightrotate(str2, 4));
    }

    static String leftrotate(String str, int d) {
        String ans = str.substring(d) + str.substring(0, d);
        return ans;
    }

    static String rightrotate(String str, int d) {
        return leftrotate(str, str.length() - d);
    }
}

