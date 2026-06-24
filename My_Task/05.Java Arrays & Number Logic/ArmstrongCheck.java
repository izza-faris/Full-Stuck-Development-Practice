public class ArmstrongCheck {
    public static void main(String[] args) {

        int num = 153;
        int original = num;
        int sum = 0;

        while (num > 0) {

            int digit = num % 10;   // last digit எடுக்கிறது
            sum = sum + (digit * digit * digit);  // cube செய்கிறது (³)
            num = num / 10;         // last digit remove செய்கிறது
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
