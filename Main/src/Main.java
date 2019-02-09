import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
    static class comp implements Comparator<Entry<String, Integer>> {
        @Override
        public int compare(Entry<String, Integer> c1, Entry<String, Integer> c2) {
            if (c1.getValue() == c2.getValue())
                return c1.getKey().compareTo(c2.getKey());
            else
                return c2.getValue().compareTo(c1.getValue());
        }
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        Reader r = new InputStreamReader(in, "UTF-8");
        Scanner sc = new Scanner(r);
        HashMap<String, Integer> a = new HashMap<>();
        while (sc.hasNext()) {
            String t = sc.next();
            int l = t.length();
            int i = 0;
            while (i < l) {
                StringBuilder tt = new StringBuilder();
                for (; i < l; ++i) {
                    if (Character.isLetterOrDigit(t.charAt(i))) {
                        tt.append(Character.toLowerCase(t.charAt(i)));
                    }
                    else {
                        ++i;
                        break;
                    }
                }
                int num = 1;
                String ttt = tt.toString();
                if (a.containsKey(ttt)) {
                    num += a.get(ttt).intValue();
                    a.remove(ttt);
                }
                a.put(ttt, num);
            }
        }

        ArrayList<Entry<String, Integer>> a1 = new ArrayList<Entry<String, Integer>>(a.entrySet());

        a1.sort(new comp());

        int l = min(a1.size(), 10);
        int i = 0;
        while (i < l) {
            System.out.println(a1.get(i).getKey());
            ++i;
        }
    }
}
