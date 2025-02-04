import java.io.*;
import java.util.*;

class YourGPA {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double creditSum = 0; // 학점 총합 
        double cumulativeGPA = 0; // 학점 * 과목평점 총합 
        Map<String, Double> grade = Map.of("A+", 4.5, "A0", 4.0,
                                           "B+", 3.5, "B0", 3.0,
                                           "C+", 2.5, "C0", 2.0,
                                           "D+", 1.5, "D0", 1.0,
                                           "F", 0.0);
        
        for (int i = 0; i < 20; i++) {
            String[] subjectInfo = reader.readLine().split(" ");
            double credit = Double.parseDouble(subjectInfo[1]);
            if (subjectInfo[2].equals("P")) {
                continue;
            }
            creditSum += credit;
            cumulativeGPA += (grade.get(subjectInfo[2]) * credit);
        }
        double GPA = cumulativeGPA / creditSum;
        System.out.println(GPA);
    }
}
