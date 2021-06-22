package algoritthm.practice;

import org.springframework.util.StringUtils;

public class Test01 {

    /*
    *
    * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
    * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
    * */

    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String number = String.valueOf(x);
        if (number.length() %2==0){

        }else {

        }
        return true;

    }

    public static void main(String[] args) {
        Integer x = 121;
        System.out.println("判断["+x+"]是否为回文数的结果为"+isPalindrome(x));
    }

}
