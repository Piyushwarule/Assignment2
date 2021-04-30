// Java program to demonstrate the
// short circuiting using OR
class task1 {
    public static void main(String arg[])
    {
 
        // Since first operand is true
        // and operator is ||,
        // Evaluation stops and
        // true is returned.
        if (true || false || false) {
            System.out.println("This output got printed actually due to short circuit");
        }
        else {
            System.out.println(
                "This output will not be printed");
        }
 
        // Whole expression will be evaluated,
        // as no true is encountered
        // before last condition
        // Therefore no Short circuit
        if (false || false || true) {
            System.out.println(
                "This output gets printed as there will be no Short circuit");
        }
        else {
 
            System.out.println("This output will not be printed");
        }
    }
}