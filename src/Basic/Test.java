package Basic;
import java.lang.*;

public class Test {

    public static void dataTypes()
    {
        //primitive data types
        boolean bb = false;  //true or false
        byte by = 12; // -128 to 127
        short sh = 15; // 16 bit singed
        int a=56; //32-bit signed
        long l = 1234566; //64-bit signed
        float b = 12.36f;  //32-bit IEEE754 ,Up-to 7 decimal digits
        double d = 12.34;  //Up-to 64 bit IEEE754, Up-to 16 decimal digits
        char ch = 'A';   // Unicode and 16 bit, ASCII value 0 to 255

        String s = "Demo string";


       /*TYPE CASTING
       Automatically by JVM -> Implicit Type Casting
       Forcefully by Programmer -> Explicit TYpe Casting
        */

        double dd = a;  // implicit , int to double
        //int cc = l; // long to int cannot be automatically converted
        int cc = (int)l; // in this way we can type cast

    }

    public static void operatorsDemo()
    {

        //Unary Operator
        //PostFix   exp++, exp--
        int a = 0;
        System.out.println(a++);  // 0  -> First return then increment

        //Prefix  --exp, ++exp, +exp, -exp, ~exp->Bitwise complement, !exp -> Boolean not
        System.out.println(++a); //2   -> First increment then return

        //Arithmetic Operator
        //Multiplicative * / %
        System.out.println(2*3); //6
        System.out.println(8/3); //2 Since returning the integer part
        System.out.println((float)8/3); //2.666667  -> Float value
        System.out.println(10%3); // 1 , remainder

        //Additive  +, -
        System.out.println(2+3);  //5
        System.out.println(2-3);  //-1
        System.out.println(2+3.6);   //5.6   int<op>float -> float


        //Relational  -> always returns boolean value
        //Comparison  <,<=,>=,>, instanceof
        System.out.println(2<3);  // true
        System.out.println(2>=3);  //false


        //Equality  ==, !=
        System.out.println(12==13);  //false
        System.out.println(12!=13);  //true


        //Logical Operators  && , ||
        System.out.println(12!=13 && 1!=2 && 2!=2);  // false // all the conditions must be true but here last one is false, will return false the moment it finds the first false
        System.out.println(12!=12 || 1!=2 || 2!=2);  //true // all the conditions must be false then only it will return false, the moment it finds first true will return true

        //Ternary
        int tt = 3<2? 20:30; // tt ->30,    condition ? true return value : false return value

        //Bitwise  &, ^, |


        //Shift   <<, >>


        //Assignment   =, +=, -=, *=, %=, &=, ^=, |=, <<= , >>= ,>>>=
        // a+=b --> a= a + b;

    }

    public static void conditionalStatements()
    {
        /*
        *  if(cond)
        * {
        *       statements
        * }
        * else if(cond)
        * {
        *       statements
        * }
        * else
        * {
        *       statements
        * }
        *
        *
        * if -> else
        * if -> else if
        *
        * */

        if(12>13)
        {
            System.out.println("Hello 12");
        }

        else if(12<13 && 13 > 14)
        {

            System.out.println("hello 13");
        }
        else
        {
            System.out.println("Hello all");
        }

        /*
        Switch statements

        switch(expression)
        {
            case value1:  statements ; break;
            case value2:  statements ; break;
            case value3:  statements ; break;
            case value4:  statements ; break;
            default : statements ; break;
        }

           // case Values must be static -> int, string, char, bool and cannot be an expression

         */
    }

    public static void loopExample()
    {
            for(int i =0;i<10;i++)
            {
                System.out.println("Hello World");
            }



            // Entry control loop
            int c =0;
            while(c<10)
            {
                System.out.println("Second loop");
                c++;
            }


            //Exit control loop
            do
            {
                System.out.println("Do loop");
                c++;
            }while(c<20);


            //For each loop
            int arr[] ={12,13,14,15,16,17};
            for(int e : arr)
            {
                System.out.println(e);
            }

    }

    public static void breakContinue()
    {
        /*
        break statements
        continue statements
        */

    }


    public static void main(String[] args)
    {
        System.out.println("Hello world");
        System.out.print("Next line print u the cursor doesn't move to next line");
        operatorsDemo();
    }


}
