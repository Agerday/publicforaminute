public class VTCodelab24 {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Assignment 24");
        System.out.println("--------------");

        // ----------------
        // Declare and initialize a double variable, give it value 45.95
        // Declare an int variable, initialize it with the double variable
        // Does it work? Write a comment on why (not)? If the code doesn't compile, put the code itself in comment
        double aDouble = 45.95;
        int anInt = (int)aDouble;
        System.out.println("We need to cast otherwise it won't compile since int can not contain decimal number");
        System.out.println(anInt);
    }

}
