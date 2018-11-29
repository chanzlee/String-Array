import java.util.Arrays;

public class StringAndArray {
    public static void main (String args[]) {
//        System.out.println(CheckPermutation("god","fog"));
//        System.out.println(CheckPermutation("god","dog"));
    }

    public static boolean CheckPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String newStr1 = new String(arr1);
        String newStr2 = new String(arr2);

        if (newStr1.equals(newStr2)) {
            return true;
        }
        return false;
    }
}
