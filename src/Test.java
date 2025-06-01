import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int total = 0;
        System.out.print("Enter name: ");
        String name = input.nextLine().toUpperCase();
        boolean first = true;
        for (int i = 0; i < name.length(); i++) {
            char alphabet = name.charAt(i);
            // Skip spaces
            if (alphabet == ' ') continue;
            int value = 0;
            //check operator
            switch (alphabet) {
                case 'A', 'J', 'S' -> value = 1;
                case 'B', 'K', 'T' -> value = 2;
                case 'C', 'L', 'U' -> value = 3;
                case 'D', 'M', 'V' -> value = 4;
                case 'E', 'N', 'W' -> value = 5;
                case 'F', 'O', 'X' -> value = 6;
                case 'G', 'P', 'Y' -> value = 7;
                case 'H', 'Q', 'Z' -> value = 8;
                case 'I', 'R' -> value = 9;
                default -> System.out.println("Invalid Input");
            }
            System.out.print(value);
            if (i!=name.length()-1){
                System.out.print("+");
            }
            total += value;
        }
        System.out.println("="+total);

        int sum=0;
        String numStr = Integer.toString(total);
        while(numStr.length() !=1) {
            sum=0;
            while (total != 0) {
                sum += total % 10;
                total /= 10;
            }
            total = sum;
            numStr = Integer.toString(total);
        }
        System.out.println("sum: "+sum);
    }
}
