public class Variable {
    static int x;//class level variable- here default value provide by java
    public static void main(String[] args) {
        int a;//local variable - Do not get default value
        //System.out.println(a);//error
        System.out.println(x);
    }
}
