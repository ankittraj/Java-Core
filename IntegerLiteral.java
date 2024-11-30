public class IntegerLiteral{ //Literal - Data in Program
    public static void main(String args[]){
        int a = 104;//Decimal Integer Literal
        int b = 0150;//Octal Integer Literal
        int c = 0x68;//Hexa Integer Literal - 0X68
        int d = 0b1101000;//Binary Integer Literal - 0B1101000
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        int x = 6_85_42_147;
        //int x = _6_85_42_147_; syntax error
        System.out.println(x);
    }
}