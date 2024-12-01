public class TypeCasting1 {
    public static void main(String[] args) {
        int a = 10;
        double b = a;//implicit/upcasting/widening typecasting
        System.out.println(a);
        System.out.println(b);

        double x= 10.3;
        //int y = x;//error
        int y = (int)x;//explicit/downcasting/narrowing typecasting
        System.out.println(x);
        System.out.println(y);
    }
}
