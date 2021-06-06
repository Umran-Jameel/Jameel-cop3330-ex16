import java.util.*;

public class Exercise16 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your age? ");
        String ag = in.nextLine();
        int age = Integer.parseInt(ag);

        String out = (age > 15) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.println(out);
    }
}
