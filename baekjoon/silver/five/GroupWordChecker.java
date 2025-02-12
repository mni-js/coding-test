// 1. 단어를 입력받는다.
// 1-1. 단어를 set에 정리해놓는다.
// 2. 단어의 첫문자부터 끝문자까지 반복한다.
// 2-1. set 내에 알파벳이 존재하면 set에서 해당 알파벳을 제거한다.
// 2-2. set 내에 알파벳이 존재하지 않으면 반복문 종료.
// 2-3. set이 빈 set이 되면 count += 1
// 3. 다음 단어로.

import java.io.*;
import java.util.*;

class GroupWordChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        
        int N = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            Set<String> alphabetSet = new HashSet<>();
            String inputWord = reader.readLine();
            List<String> wordList = new ArrayList<>(Arrays.asList(inputWord.split("")));
            
            for (String word: wordList) {
                alphabetSet.add(word);
            }

            while (wordList.size() > 0) {
                if (wordList.size() > 1) {
                    if (wordList.get(0).equals(wordList.get(1))) {
                        wordList.remove(wordList.get(0));
                        continue;
                    }
                }
                

                if (alphabetSet.contains(wordList.get(0))) {
                    alphabetSet.remove(wordList.get(0));
                    wordList.remove(wordList.get(0));
                } else {
                    break;
                }
            }
            
            if (wordList.size() == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
