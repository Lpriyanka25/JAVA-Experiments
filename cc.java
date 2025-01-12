import java.util.*;

class Codechef {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
    
        if (b == 0) {
            System.out.println("infinity");   // uncomment the if condition
            return;
        }
        

        System.out.println(a / b);
    }
}
