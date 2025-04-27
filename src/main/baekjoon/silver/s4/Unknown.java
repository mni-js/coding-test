package baekjoon.silver.s4;

import java.util.*;
import java.io.*;

public class Unknown {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        Map<String, Integer> peopleMap = new HashMap<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N + M; i++) {
            String key = br.readLine();
            peopleMap.put(key, peopleMap.getOrDefault(key, 0) + 1);
        }

        List<String> keys = new ArrayList<>(peopleMap.keySet());
        Collections.sort(keys);

        int count = 0;
        for (String key: keys) {
            if (peopleMap.get(key) >= 2) {
                count++;
                sb.append(key).append("\n");
            }
        }
        sb.insert(0, count + "\n");
        System.out.println(sb);
    }
}