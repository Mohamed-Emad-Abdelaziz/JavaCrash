//varibal and constants 
//primitive and reference types 
//casting
//numbers strings and arrays 
//read input
import java.util.Arrays;
import java.util.Date;
import java.awt.*;
import java.text.NumberFormat;
public class Types {
    public static void main(String[] args) {
        byte myAge = 30;
        long viewsCount = 3_234_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
        //refrance types
        Date now = new Date();
        System.out.println(now);
        String message = new String("Hello World");
        String message2 = "Hello world" + "!!";
        System.out.println(message2.endsWith("!!"));
        Point point1 = new Point(1, 1);
        //now what if you want to add a spcial carcter ???
        String mes = " \n hello \" world \\ ";
        System.out.println(mes);
        int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 2;
        //here how to make the array in a form that can be seen 
       String a= Arrays.toString(numbers);
        // now lets see 
        System.out.println(a);
        //make an array and see itis length 
        int[] numbers22 = { 1, 5, 3, 4, 2, 6 };
        //how to sort the arrays 
        Arrays.sort(numbers22);
        String b = Arrays.toString(numbers22);

        System.out.println(b);
        //now how to create a two dimnsion array 
        int[][] twoDim = new int[5][3];
        //we can not get to itis elements with the normal ways we need to use deep 
        twoDim[0][1] = 5;
        System.out.println(Arrays.deepToString(twoDim));
        // now we will learn constant 
        //we write the word final 
        final float pi = 3.14F;

        //now we are going to talk about arthmatic expresions  
        //first how to convert a string to an integer 
        String x2 = "1.1";
        double y = Double.parseDouble(x2);
        //Math class and performaing a mathmatical operations 
        int result = Math.round(1.1f);
        //we have ceil and floor 
        //ceil take the number and make it close to the nearset biggest number 
        //but in the case of the floor take the number and make it close to the next biggest number 
        //ceil x floor 
        //but they have to be integer first 
        //here is an example 
        int resultC = (int) Math.ceil(1.1f);
        //so the answer will be 2 
        int resultF = (int) Math.floor(1.1f);
        //so the answer will be 1
        //now how to formate a number 
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String c = currency.format(100.534);
        System.out.println(c);
        //$100.53



        




    }
}
