public class CharacterLiteral {
    public static void main(String[] args) {
        char a = 'h'; //CharacterLiteral
        //char a = 'hi'; //error
        //char a = 'h'; //error
        char b = '@'; //CharacterLiteral
        char c = '+'; //CharacterLiteral
        char d = '4'; //CharacterLiteral

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        char x = 104; //ASCII Code Range[0 - 255]
        char y = '\u0068';//UNII Code Range[0-65535]
        System.out.println(x);
        System.out.println(y);
        

    }
}
