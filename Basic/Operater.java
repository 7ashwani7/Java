public class Operater {
   public static void main(String[] args) {
       int a=12;
       int b=6;
       //Arithmetic -> +,-,*,/,%
       System.out.println("sum="+a+b);
       System.out.println("sub="+(a-b));
       System.out.println("mul="+a*b);
       System.out.println("div="+a/b);
       //Relational -> <,<=,>,>=,==,!=
       //Logical -> ||(OR),&&(AND),!(NOT)
       System.out.println(a<b);
       System.out.println(a<=b);
       System.out.println(a>b);
       System.out.println(a>=b);
       System.out.println(a==b);
       System.out.println(a!=b);
       System.out.println((5>7)||(7>6));
       System.out.println((5<7)&&(7>6));
       System.out.println(!(5>7)&&(7>6));
   } 
}
 