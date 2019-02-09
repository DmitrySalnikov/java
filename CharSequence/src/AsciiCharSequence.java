public class AsciiCharSequence implements java.lang.CharSequence {
    AsciiCharSequence(byte[] bytes) {
        str = bytes.clone();
    }

    @Override
    public int length() {
        return str.length;
    }

    @Override
    public char charAt(int index) {
        return (char)str[index];
    }

    @Override
    public java.lang.CharSequence subSequence(int start, int end) {
        byte[] str2 = new byte[end - start];
        for (int i = 0; i < end - start; ++i) {
            str2[i] = str[i + start];
        }
        return new AsciiCharSequence(str2);
    }

    public String toString() {
        return new String(str);
    }

    private byte[] str;
}
