import java.util.Arrays;

public class Student {
    String firstName;
    String secondName;
    int groopNumber;
    int[] successful;

    public Student(String firstName, String secondName, int groopNumber, int[] successful) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.groopNumber = groopNumber;
        this.successful = successful;
    }

    public double getSuccessful() {
        int res = 0;
        for (int suc : successful) {
            res = res+suc;
        }

        return (double) res/5;
    }

    @Override
    public String toString() {
        return " Студент " +
                " Имя: " + firstName +
                ", Фамилия: " + secondName  +
                ", Группа: " + groopNumber +
                ", Оценки: " + Arrays.toString(successful);
    }
}
