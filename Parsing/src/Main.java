public class Main {

    public static void main (String [] args) {

        String myString = "1947";
        System.out.println("My string is = " + myString);

        int number = Integer.parseInt(myString);
        System.out.println("Parsed value from a string is " + number);

        String myDouble = "2019.121";
        System.out.println("My string value is = " + myDouble);

        double decimal = Double.parseDouble(myDouble);
        System.out.println("Parsed value of the string is " + decimal);
    }
}
