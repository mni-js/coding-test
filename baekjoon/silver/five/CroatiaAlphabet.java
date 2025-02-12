// {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="} -> 총 8개
// inputWord = 최대 길이 100글자(알파벳 소문자 + "-" + "=")

import java.io.*;
import java.util.*;

class CroatiaAlphabet {
    public static void main(String[] args) throws IOException {
        List<String> croatiaAlphabets = List.of("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputWord = reader.readLine();
        int count = 0;
        
        for (int i = 0; i < inputWord.length(); i++) {

            // subWord1: 대부분의 크로아티아 알파벳, subWord2: "dz="(혼자 길이가 3이기 때문에)
            String subWord1 = i+2 <= inputWord.length() ? inputWord.substring(i, i+2) : "ABC";
            String subWord2 = i+3 <= inputWord.length() ? inputWord.substring(i, i+3) : "ABC";

            // 크로아티아 알파벳이 맞을 경우 다음 확인 때 겹치지 않게 i값 추가
            if (croatiaAlphabets.contains(subWord1)) {
                count++;
                i++;
            } else if (croatiaAlphabets.contains(subWord2)) {
                count++;
                i += 2;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}
