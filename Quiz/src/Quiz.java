import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.math.BigInteger;
import java.util.Arrays;

public class Quiz {

    public static BigInteger factorial(int value) {
        BigInteger s = BigInteger.valueOf(1);
        for (int i = 2; i <= value; ++i)
            s = s.multiply(BigInteger.valueOf(i));
        return s; // your implementation here
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] a = new int[a1.length + a2.length];
        System.arraycopy(a1, 0, a, 0, a1.length);
        System.arraycopy(a2, 0, a, a1.length, a2.length);
        Arrays.sort(a);
        return a; // your implementation here
    }

    public static boolean isPalindrome(String text) {
        StringBuilder a = new StringBuilder(text);
        for (int i = text.length() - 1; i >= 0; --i)
            if (!Character.isLetterOrDigit(a.charAt(i)))
                a.deleteCharAt(i);
            else
                a.setCharAt(i, Character.toLowerCase(a.charAt(i)));
        for (int i = a.length() / 2 - 1; i >= 0; --i)
            if (a.charAt(i) != a.charAt(a.length() - 1 - i))
                return false;
        return true;
    }

    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }
        System.out.println();
        System.out.println(0x0.Fp3);
        System.out.println((char)('/' + 30));
        int value = 2;
        System.out.println(Integer.bitCount(value));
        System.out.println("A" + 12);
        String a = "Madam, I'm Adam!";
    }
}