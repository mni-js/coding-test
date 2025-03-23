package baekjoon.bronze.b2;

import java.util.Scanner;

class DecompositionSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetNum = scanner.nextInt();
        
        int i = 1;
        boolean isWork = true;
        while (isWork) {
            if (i < 10) {
                if ((i * 2) == targetNum) {
                    System.out.println(i);
                    isWork = false;
                }
            }
            if (i >= 10 && i < 100) {
                int tens = i / 10;
                int ones = i % 10;
                if ((i + tens + ones) == targetNum) {
                    System.out.println(i);
                    isWork = false;
                }
            }
            if (i >= 100 && i < 1000) {
                int hundreds = i / 100;
                int tens = (i % 100) / 10;
                int ones = (i % 100) % 10;
                if ((i + hundreds + tens + ones) == targetNum) {
                    System.out.println(i);
                    isWork = false;
                }
            }
            if (i >= 1000 && i < 10000) {
                int thousands = i / 1000;
                int hundreds = (i % 1000) / 100;
                int tens = ((i % 1000) % 100) / 10;
                int ones = ((i % 1000) % 100) % 10;
                if ((i + thousands + hundreds + tens + ones) == targetNum) {
                    System.out.println(i);
                    isWork = false;
                }
            }
            if (i >= 10000 && i < 100000) {
                int tenThousands = i / 10000;
                int thousands = (i % 10000) / 1000;
                int hundreds = ((i % 10000) % 1000) / 100;
                int tens = (((i % 10000) % 1000) % 100) / 10;
                int ones = (((i % 10000) % 1000) % 100) % 10;
                if ((i + tenThousands + thousands + hundreds + tens + ones) == targetNum) {
                    System.out.println(i);
                    isWork = false;
                }
            }
            if (i >= 100000 && i < 1000000) {
                int hundredThousands = i / 100000;
                int tenThousands = (i % 100000) / 10000;
                int thousands = ((i % 100000) % 10000) / 1000;
                int hundreds = (((i % 100000) % 10000) % 1000) / 100;
                int tens = ((((i % 100000) % 10000) % 1000) % 100) / 10;
                int ones = ((((i % 100000) % 10000) % 1000) % 100) % 10;
                if ((i + hundredThousands + tenThousands + thousands + hundreds + tens + ones) == targetNum) {
                    System.out.println(i);
                    isWork = false;
                }
            }
            if (i == 1000000) {
                if ((i + 1) == targetNum) {
                    System.out.println(i);
                    isWork = false;
                } else {
                    break;
                }
            }
            i++;
        }
        if (isWork) {
            System.out.println(0);
        }
    }
}
