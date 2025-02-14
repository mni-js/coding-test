import java.util.Scanner;

class MovieDirector {
    /*
        1. 666
        2. 1666 ~ 6. 5666
        7. 6660 ~ 16. 6669
        17. 7666 ~ 19. 9666
        20. 10666
        ...

        1부터 차례대로 순회하면서 종말의 수 count를 1씩 추가하는 방식
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int apocalypseNumberCnt = 0; // 종말의 수 count 
        int nthMovie = scanner.nextInt(); // 몇번째 영화인지 

        int apocalypseNum = 0; 
        while (nthMovie > apocalypseNumberCnt) { // 종말의 수와 n번째가 같아질 때까지 반복 
            apocalypseNum++;
            if (String.valueOf(apocalypseNum).contains("666")) { // 숫자를 문자열로 바꿨을 때 666이 포함되는지(= 종말의 수인지) 
                apocalypseNumberCnt++; 
            } 
        }
        System.out.println(apocalypseNum);        
    }
}
