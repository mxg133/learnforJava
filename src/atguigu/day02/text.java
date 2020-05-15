package atguigu.day02;

public class text {
    public static void main(String[] args) {
        byte b1 = 2;
        int i1 = 129;

        int i2 = b1 + i1;
        System.out.println(i2);

        long l1 = b1 + i1;
        System.out.println(l1);

        float f = b1 + i1;
        System.out.println(f);
//        (byte & char & short) -> int -> long -> float -> double

        char c1 = 'a';
        int i3 = 10;
        int i4 = c1 + i3;
        System.out.println(i4);
    }
}
