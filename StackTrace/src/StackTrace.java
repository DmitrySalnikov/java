public class StackTrace {
    public static String getCallerClassAndMethodName() {
        StackTraceElement[] a = new Throwable().getStackTrace();
        if (a.length < 3 || a[2].isNativeMethod()) {
            return null;
        }
        return a[2].getClassName() + "#" + a[2].getMethodName();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }
}
