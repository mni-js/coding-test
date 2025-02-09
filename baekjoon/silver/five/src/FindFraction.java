import java.util.Scanner;

class FindFraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetNum = scanner.nextInt();
        int initialNum = 0;
        int numberToAdd = 1;
        boolean leftIsBig = false;

        while (true) {
            initialNum += numberToAdd;
            if (numberToAdd % 2 == 0) {
                leftIsBig = true;
            } else {
                leftIsBig = false;
            }

            if (targetNum > initialNum) {
                numberToAdd++;
                continue;
            }
            
            if (leftIsBig) {
                int leftNum = numberToAdd - (initialNum - targetNum);
                int rightNum = 1 + (initialNum - targetNum);
                System.out.println(leftNum + "/" + rightNum);
                break;
            } else {
                int leftNum = 1 + (initialNum - targetNum);
                int rightNum = numberToAdd - (initialNum - targetNum);
                System.out.println(leftNum + "/" + rightNum);
                break;
            }
        }
    }
}
