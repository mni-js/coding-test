package baekjoon.bronze.b2;

import java.io.*;
import java.util.*;

class MathLecture {
    public static void main(String[] args) throws IOException {

        // 해답인 x, y 변수를 정의한다.
        int x = 0, y = 0;

        // 1. a, b, c, d, e, f를 입력 받아서 배열에 보관한다.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] abcdef = Arrays.stream(reader.readLine().split(" "))
                             .mapToInt(Integer::parseInt)
                             .toArray();

        // abcdef배열의 인덱스 0, 3번째는 x의 계수 | 1, 4번째는 y의 계수 | 2, 5번째는 상수다.
        // x의 계수를 공배수로 맞추면, x는 사라지고 y와 상수만 남는다.
        int a = abcdef[0], b = abcdef[1], c = abcdef[2], d = abcdef[3], e = abcdef[4], f = abcdef[5];

        // adx + bdy = cd, adx + eay = af  =소거=> (bd - ea)y = (cd - af) =이항=> y = (cd - af) / (bd - ea)
        y = (c * d - f * a) / (b * d - e * a);

        // 기존 방정식에 y값을 대입해서 x값을 구해준다. x = (c - b * y) / a
        if (a != 0) {
            x = (c - b * y) / a;
        } else {
            x = (f - e * y) / d;
        }
        
        // x와 y를 출력한다.
        System.out.println(x + " " + y);
    }
}
