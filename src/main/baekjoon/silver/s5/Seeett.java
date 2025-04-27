import java.util.*;
import java.io.*;

public class Main {
    private static Set<Integer> intSet = new HashSet<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int target = 0;
            if (st.hasMoreTokens()) {
                target = Integer.parseInt(st.nextToken());
            }

            printResult(command, target);
        }
    }

    private static void printResult(String command, int target) {
        switch (command) {
            case "add":
                intSet.add(target);
                break;
            case "remove":
                intSet.remove(target);
                break;
            case "check":
                int bool = intSet.contains(target) ? 1 : 0;
                System.out.println(bool);
                break;
            case "toggle":
                if (intSet.contains(target)) {
                    intSet.remove(target);
                } else {
                    intSet.add(target);
                }
                break;
            case "all":
                intSet = new HashSet<>();
                for (int i = 0; i < 20; i++) {
                    intSet.add(i + 1);
                }
                break;
            default:
                intSet = new HashSet<>();
        }
    }
}