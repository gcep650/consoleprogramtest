
public class Testing extends ConsoleProgram
{
    public static void main(String[] args)
    {
        ConsoleProgram c = new ConsoleProgram();
        int i = c.readInt("Type an integer: ");
        System.out.println("You typed: " + i);
    }
}
