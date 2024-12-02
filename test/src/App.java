import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("How many parts of speech are in Standard English?");
        int ans = scan.nextInt();
        if (ans==8) {
            System.out.println("yes");
            System.out.println("Please write a 4-6 sentence paragraph about your opinions on American transcendentalism");
            String par = scan2.nextLine();
            System.out.println("You wrote: "+par);
            System.out.println("Please let your proctor know that you have written your paragraph so they can grade it.");
            System.out.println("Please do not terminate this program while the proctor grades your paragraph");
            System.out.println("\nif you are the proctor and the test taker passed, type in the proctor passcode now");
            int a = scan.nextInt();
            if (a==3141592) {
                System.out.println("Congrats! You passed!");
            } else {
                System.out.println("Whoops you failed :(");
            }
        } else {
            System.out.println("no");
        }
    }
}
