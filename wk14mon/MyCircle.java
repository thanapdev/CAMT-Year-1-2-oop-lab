//642115022
//thanapong yamkamol    

public class MyCircle {
    public static void main(String[] args) {
        GivenCircle c1 = new GivenCircle(60.0);
        GivenCircle c2 = new GivenCircle(50.0);

        System.out.println(c1.isEqual(c2));
        System.out.println(c1.compareTo(c2));
    }
}
