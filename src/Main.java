public class Main {


    public static void main(String[] args) {
        for (Student a : sortSuccessful(createStudent())) {
            System.out.println(a.toString() + " Средний балл " + a.getSuccessful());
        }
        get45(createStudent());
    }

    public static Student[] createStudent() {
        Student[] students = new Student[5];
        students[0] = new Student("Edward", "Protas", 21, new int[]{4, 5, 4, 4, 5});
        students[1] = new Student("Kirill", "Fedoruk", 23, new int[]{5, 2, 4, 5, 5});
        students[2] = new Student("Vladislav", "Shepa", 21, new int[]{5, 5, 5, 4, 5});
        students[3] = new Student("Alex", "Zaharevich", 20, new int[]{4, 3, 5, 4, 3});
        students[4] = new Student("Dima", "Bitnih", 21, new int[]{5, 5, 5, 5, 5});
        return students;
    }

    public static Student[] sortSuccessful(Student[] students) {
        for (int i = students.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (students[i].getSuccessful() > students[j].getSuccessful()) {
                    Student a = students[i];
                    students[i] = students[j];
                    students[j] = a;
                }
            }
        }
        return students;
    }

    public static void get45 (Student[] student){
        for (Student st : student){
            int counter =0;
            for (int a : st.successful){
                if (a == 4 || a ==5) counter++;
            }
            if (counter == 5){
                System.out.println("Студент " +st.secondName + " группы " + st.groopNumber + " имеют оценки не ниже 4");
            }
        }

    }

}
