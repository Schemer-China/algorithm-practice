package algoritthm.practice;

public class Test01 {

    /*
    *
    * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
    * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
    * */

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String number = String.valueOf(x);
        Integer len = number.length();
        for (int i = 0; i < len / 2; i++) {
            if (!number.substring(i, i + 1).equals(number.substring(len - i - 1, len - i))) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Integer x1 = 123;
        System.out.println("判断["+x1+"]是否为回文数的结果为"+isPalindrome(x1));
        Integer x2 = 121;
        System.out.println("判断["+x2+"]是否为回文数的结果为"+isPalindrome(x2));
        Integer x3 = -11;
        System.out.println("判断["+x3+"]是否为回文数的结果为"+isPalindrome(x3));
        Integer x4 = 101;
        System.out.println("判断["+x4+"]是否为回文数的结果为"+isPalindrome(x4));
        Integer x5 = -101;
        System.out.println("判断["+x5+"]是否为回文数的结果为"+isPalindrome(x5));
        Integer x6 = 123454321;
        System.out.println("判断["+x6+"]是否为回文数的结果为"+isPalindrome(x6));
    }

}
