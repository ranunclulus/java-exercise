package week2.day2;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student();
        students[0].name = "김경록";
        students[0].phonenumber = "010-1234-5678";
        students[0].age = 37;
        // 초기화 안 해 주면 Null Exception 발생
        students[1] = new Student();
        students[1].name = "김지유";
        students[1].phonenumber = "010-2222-3333";
        students[1].age = 10;
    }
}
