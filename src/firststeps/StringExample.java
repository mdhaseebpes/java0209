package firststeps;

public class StringExample {

    public static void main(String[] args) {

        String myString = "my String";
        String myStringUnicode = "\u0044";

        System.out.println(myString + myStringUnicode);

        int myInt  = 10;
       String newString = myString + myInt +20;
        System.out.println(newString);

        String newString1 = myInt +20 + myString;
        System.out.println(newString1);

        double myDouble  = 10d;
        String newStringDouble = myString + myDouble +20;
        System.out.println(newStringDouble);
        String newStringDouble1 = myDouble +20 + myString;
        System.out.println(newStringDouble1);

        System.out.println("**** String *****");
        String mylastString  = "This is my String";
        mylastString = "Starting with " + mylastString;

        System.out.println(mylastString);

       int num  = 10;
       mylastString = mylastString + num;

        System.out.println(mylastString);


    }
}
