import java.io.*;

public class Serialize {
    static Animal[] res(byte[] a) {
        Animal[] an = null;
        ObjectInputStream i = null;
        try {
            i = new ObjectInputStream(new ByteArrayInputStream(a));
            int sz = i.readInt();
            an = new Animal [sz];
            for (int j = 0; j < sz; ++j)
                an[j] = (Animal)i.readObject();
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
        return an;
    }

    public static void main(String[] args) {
        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ObjectOutputStream o = new ObjectOutputStream(bo);
            o.writeInt(4);
            o.writeObject(new Animal("dog"));
            o.writeObject(new Animal("cat"));
            o.writeObject(new Animal("duck"));
            o.writeObject(new Animal("rat"));
            Animal[] a = res(bo.toByteArray());
            for(int i = 0; i < 4; ++i)
                System.out.println(a[i].name);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
