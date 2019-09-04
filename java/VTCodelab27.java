public class VTCodelab27 {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Assignment 27");
        System.out.println("--------------");

        // ----------------
        // Declare and initialize a short variable, give it value 128
        // Declare a byte variable, initialize it with the short variable, cast it to a byte
        // Print the result using: System.out.println("Printing a byte initialized with a casted short (128): " + <YOUR_BYTE_VARIABLE_NAME>);
        // Does it look as expected? Write a comment on why (not)?

        short aShort = 128;
        byte aByte = (byte) aShort;
        System.out.println("Printing a byte initialized with a casted short (127): " + aByte);
        System.out.println("Since byte variable can not contain number bigger than 127 it will continue from the smaller possible number from the byte variable");
        System.out.println("so 128 will become -128, 129 will become -127 ...");
    }
}
