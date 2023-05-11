package CodeUp;

import java.util.*;

class Student {
    private String code;
    private int testId;
    private String name;


    public Student(String code, int testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public int getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class CodeUp3108 {
    private List<Student> students = new ArrayList<>();
    public Student makeAStudent(String code, int testId, String name) {
        return new Student(code, testId, name);
    }
    private boolean isExisted(Student pStudent) {
        // 중복 여부 check
        for (Student student : students){
            if(pStudent.getTestId() == student.getTestId()){
                return true;
            }
        }
        return false;
    }
    private void addStudent(Student student) {
        if (!isExisted(student)) {
            students.add(student);
        }
    }

    private void printStudents() {
        for (Student student : students) {
            System.out.printf("%s %d %s\n", student.getCode(), student.getTestId(), student.getName());
        }
    }

    private void deleteStudent(Student pstudent) {
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getTestId() == pstudent.getTestId()) students.remove(i);
        }
    }

    public void process(Student pstudent) {
        switch (pstudent.getCode()){
            case "I" -> addStudent(pstudent);
            case "D" -> deleteStudent(pstudent);
        }
    }

    private void printSpecificStudents(int[] arr) {
        // 정렬
        Collections.sort(students,new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getTestId() - o2.getTestId();
            }
        });
        for (int i = 0; i < arr.length; i++) {
            Student student = students.get(arr[i] - 1);
            System.out.printf("%d %s\n", student.getTestId(), student.getName());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        CodeUp3108 codeUp3108 = new CodeUp3108();
        for (int i = 0; i < number; i++) {
            String code = sc.next();
            int testId = sc.nextInt();
            String name = sc.next();
            Student student = codeUp3108.makeAStudent(code, testId, name);
            codeUp3108.process(student);
        }
        int[] index = new int[5];
        for (int i = 0; i < 5; i++) {
            index[i] = sc.nextInt();
        }
        codeUp3108.printSpecificStudents(index);
    }

}

