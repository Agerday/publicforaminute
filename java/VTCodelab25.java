public class VTCodelab25 {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Assignment 25");
        System.out.println("--------------");

        // ----------------
        // Declare and initialize a double variable, give it value 45.95
        // Declare an int variable, initialize it with the double variable, but this time, cast it to an int
        // Does it work? Write a comment on why (not)?
        // Print the result using: System.out.println("Printing an int initialized with a casted double: " + <YOUR_LONG_VARIABLE_NAME>);
        // Do you notice something about what is printed?

        double aDouble = 45.95;
        int anInt = (int)aDouble;
        System.out.println("We need to cast otherwise it won't compile since int can not contain decimal number, it only returns 45");
        System.out.println(anInt);
    }

}
