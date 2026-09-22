
// 8. Object array

class student {

    int id;
    String name;

    void setvalue(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("id : " + id);
        System.out.println("name : " + name);
    }
}

public class ObjectArray {

    public static void main(String[] args) {

        student[] students = new student[3];

        students[0] = new student();
        students[0].setvalue(101, "Vaibhav");

        students[1] = new student();
        students[1].setvalue(102, "Ram");

        students[2] = new student();
        students[2].setvalue(103, "Vijay");

        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}

