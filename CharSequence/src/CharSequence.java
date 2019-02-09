public class CharSequence {
    public static void main(String[] args) {
        AsciiCharSequence a = new AsciiCharSequence(new byte[]{75, 75, 75, 75, 86});
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(2));
        System.out.println(a.charAt(3));
        System.out.println(a.subSequence(0, 5));
        System.out.println(a.toString());
        System.out.println(a.length());

    }
}
