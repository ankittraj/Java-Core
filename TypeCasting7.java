public class TypeCasting7{
    static public void main(String [] ankit){
        var a=104;
        var b="Ankit";
        var c=12.5;
        var d=true;
        var e='h';
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        int x=10,y=5;
        //var x=10,y=5;//error
        var z=x/y;
        System.out.println(z);
        
        byte m=10;
        short n=20;
        var o=m+n;
        System.out.println(o);

        var p=12;
        int q=p*2;
        System.out.println(q);
    }
}