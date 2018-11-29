import java.util.Arrays;

public class StringAndArray {
    public static void main (String args[]) {
//        System.out.println(CheckPermutation("god","fog"));
//        System.out.println(CheckPermutation("god","dog"));
        System.out.println(CheckPermutationHashMap("dog","god"));
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

    public static boolean CheckPermutationHashMap(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        int len = str1.length();
        int[] letters = new int[128];
        for (int i=0; i< len; i++) {
            letters[str1.charAt(i)]++;
        }
        for (int i=0; i< len; i++) {
            letters[str2.charAt(i)]--;
            if (letters[str2.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }

    // letters[str1.charAt(i)], str1.char seems to be coerced as int.
    // int[128] was due to ASCII code, a starting around 95 to +26, 121.
    // As array doubles the size, 128 seems like effective minimum.


    //String rotation, str1  = xy, str2 = yx,
//    yx is always a substring of str1str1 = xyxy
    public static boolean StringRotation(String str1, String str2) {
        int len = str1.length();

        if (len == str2.length() && len>0) {
            String str1str1 = str1+str1;
//            return isSubstring(str1str1, str2);
//            (assumed to be given inside the problem)
        }
        return false;
    }
}
