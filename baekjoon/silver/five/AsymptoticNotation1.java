import java.io.*;
import java.util.Arrays;

class AsymptoticNotation1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] coefficientA = Arrays.stream(reader.readLine().split(" "))
                                   .mapToInt(Integer::parseInt)
                                   .toArray();
        int a1 = coefficientA[0], a0 = coefficientA[1];
        int c = Integer.parseInt(reader.readLine());
        int n0 = Integer.parseInt(reader.readLine());

        double n = 0;
        if (c == a1) {
            if (a0 > 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        } else {
            n = a0 / (c - a1);
            if (c > a1 && n <= n0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
