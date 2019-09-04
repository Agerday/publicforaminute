public class VTCodelab16 {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Assignment 16");
        System.out.println("--------------");

        // ----------------
        // Print out the characters 'H' 'E' 'L' 'L' 'O' in this exact order, on one line
        // It's possible a number instead of HELLO is printed, why do you think this is?
        char a = 'H';
        char b = 'E';
        char c = 'L';
        char d = 'O';
        char[] e = new char[5];
        e[0]='H';
        e[1]='E';
        e[2]='L';
        e[3]='L';
        e[4]='O';
        for (char letter : e){
            System.out.print(letter);
        }
        System.out.println("\n" + (a+b+c+c+d));
        System.out.println("Each letter has an ascii number and it will add them to each other");
    }

}
