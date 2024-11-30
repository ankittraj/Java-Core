public class FloatingPointLiteral {
    public static void main(String args[]){
        double a = 2536.7843;//Floating Point Literal
        double b = 02536.7843; //0 is ignored
        double c = 25.367843e+2;
        double d = 253678.43e-2;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        double x = 25_36.78_42;
        //double x =_25_36.78_42_;
        System.out.println(x);
        
    }
}
