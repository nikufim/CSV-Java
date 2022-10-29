import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {

            var students = new Students();
            var s = students.getStudent("Белобородова Полина");

            System.out.println(s);
            System.out.println();

            System.out.println(s.getFinalScores());
            System.out.println();

            System.out.println(s.getResultModules());
    }

