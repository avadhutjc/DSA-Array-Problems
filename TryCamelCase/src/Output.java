public class Output {
    public static void main(String[] args){
//        int a=25, b=30;
//        boolean c = a>25 & b<40;
//        if(c)
//        {
//            System.out.println("RABBIT");
//        }
//        else
//        {
//            System.out.println("GOOSE");
//        }

//        int a=25, b=30;
//        boolean c = a>25 | b<40;
//        if(c)
//        {
//            System.out.println("RABBIT");
//        }
//        else
//        {
//            System.out.println("GOOSE");
//        }

//        int a=3, b=8;
//        boolean c = a>5 && ++b>6;
//        System.out.println(b);

//        Explanation:
//            ++b>6 is not evaluated as the first operand itself is false.
//            Short Circuit AND operator skips the second expression.

//        int a=5, b=9;
//        boolean c = a>1 || b++<10;
//        System.out.println(b);

//        Explanation:
//            b++<10 is not evaluated by the Short Circuit OR operator as the first operand is already true.
//            There is no need to check the second expression.

//        int a=4, b=6, c=8;
//        boolean d = a>5 && b>5 & c++<10;
//        System.out.println(c);

//        Explanation:
//        Grouping or association of operands is done first based on the priority.
//        a>5 && (b>5 & c++<10)
//        false && (anything)
//                false

//        int a=4, b=8;
//        boolean c = a>1 ^ b<10;
//        if(c)
//        {
//            System.out.println("TREE");
//        }
//        else
//        {
//            System.out.println("BIRD");
//        }

//        Explanation:
//        The exclusive operator (^) gives an output of TRUE
//        only if both the operands are different.

//        int a=5;
//        boolean b = a>1 || false; //..true || false ..true
//        b ^= false;               // true ^= false.. true
//        System.out.println(b);

//        b ^= false;
//        b = b^false;
//        b = true ^ false;
//        b = true;

//        int a=3, b=1;
//        int c = a & b;
//        System.out.println("CAT " + c);

//        Explanation:
//                Here AND & operator is used with numbers.
//                So, it is a Bitwise operator, not a Logical operator.
//        If an AND (&) operator is applied with two integers,
//        what is this operator ....> Bitwise Operator
//        char ch='A';
//        if(ch > 70)
//        {
//            System.out.println("PIZZA");
//        }
//        else
//        {
//            System.out.println("BURGER");
//        }

//        Explanation:
//                 ASCII or UNICODE value of character 'A' is 65.
//                 A char value is converted to int before comparing it.
//
//        int a=5, b=10;
//        if(++b>10||a++=5)
//        {
//            System.out.println("PIZZA="+a);
//        }
//        else
//        {
//            System.out.println("BURGER="+a);
//        }

//        If Short Circuit OR (||) does not evaluate a++==5 as
//        the first expression is true. So a is still 5.
    }
}
