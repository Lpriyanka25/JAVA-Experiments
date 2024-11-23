public class ArmstrongNumber {

    public static void main(String[] args) {
        int number = 371; // Example number to check
        boolean isArmstrong = isArmstrongNumber(number);
        
        if (isArmstrong) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        int digitCount = countDigits(number);

        while (number != 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, digitCount);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
