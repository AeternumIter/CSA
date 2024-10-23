import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = (int)(100*Math.random()+1);
        boolean b = true;
        while (b) {
            System.out.println("Pick a number between 1 and 100");
            int guess = scan.nextInt();
            if (guess>n) {
                System.out.println("lower!");
            } else if (guess<n) {
                System.out.println("higher!");
            } else {
                System.out.println("You guessed it!");
                b=false;
            }
        }
    }
}
