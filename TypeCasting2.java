public class TypeCasting2{
    static public void main(String [] rahul){
        char a='h';
        int b=a;// implicit/upcasting/widening typecasting
        System.out.println(a);
        System.out.println(b);

        int x=104;
        //char y=x;// error
        char y=(char)x;// explicit/downcasting/narrowing typecasting
        System.out.println(x);
        System.out.println(y);
    }
}