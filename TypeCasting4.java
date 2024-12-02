public class TypeCasting4{
    static public void main(String [] rahul){
        int x=15;
        //byte y=x;//error
        byte y=12;//allowed
        System.out.println(x);
        System.out.println(y);


        byte a=10,b=20;
        //byte c=a+b;//error
        byte c=(byte)(a+b);
        System.out.println(c);

        byte m=10;
        short n=20;
        //short o=m+n;//error
        short o=(short)(m+n);
        System.out.println(o);
    }
}
