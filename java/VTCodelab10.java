public class VTCodelab10 {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Assignment 10");
        System.out.println("--------------");

        // ----------------
        // Declare and initialize a long variable
        // Declare an int variable and initialize it with the above long variable
        // Does it work? Write a comment on why (not)? If the code doesn't compile, put the code itself in comment
        long aLongVariable = 5156743545684333L;
        int anIntVariable = (int) aLongVariable;
        System.out.println(anIntVariable);
        //There is no compilation error but since Long can be bigger than int it may do some strange conversion.
        //like 5156743545684333 as long become -348323475 as int
    }

}
