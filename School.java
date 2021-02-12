import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;

//class used to run program
public class School {
    public static void main(String args[]) {
        //creates and adds students to initial ArrayList
        ArrayList<Student> studentlist = new ArrayList<Student>();
        Student A = new Student("1", "A", "alpha", "A+", 1, 11);
        Student B = new Student("2", "B", "bravo", "B+", 2, 12);
        Student C = new Student("3", "C", "charlie", "C+", 3, 13);
        studentlist.add(A);
        studentlist.add(B);
        studentlist.add(C);
        System.out.println(studentlist);

        //creates and adds teachers to initial ArrayList
        ArrayList<Teacher> teacherlist = new ArrayList<Teacher>();
        Teacher TA = new Teacher("ap math", "Arthur", "arthur", 9);
        Teacher TB = new Teacher("basic math", "Beatriz", "beatriz", 8);
        Teacher TC = new Teacher("challanged math", "Carl", "carl", 10);
        teacherlist.add(TA);
        teacherlist.add(TB);
        teacherlist.add(TC);
        System.out.println(teacherlist);
        Main main = new Main();

        //creates and adds courses to initial ArrayList
        ArrayList<String> courselist = new ArrayList<String>();
        String art = "art";
        String blackart = "blackart";
        String colorart = "colorart";
        courselist.add(art);
        courselist.add(blackart);
        courselist.add(colorart);
        System.out.println("course list:" + courselist);

        //calls funtion to add ten students
        addstudent(studentlist, 10);

        //calls function to add 3 teachers
        addteacher(teacherlist, 3);

        //calls function to remove 3 students at position 0
        removestudent(studentlist, 0);
        removestudent(studentlist, 0);
        removestudent(studentlist, 0);

        //calls function to remove 1 teacher at position 0
        removeteacher(teacherlist, 0);

        //prints out student, teacher, and course lists
        System.out.println(studentlist);
        System.out.println(teacherlist);
        System.out.println(courselist);

    }

    //funtion used to add teachers
    static void addteacher(ArrayList teacherlist, int d){
        int x = 0;
        while (x < d) {
            teacherlist.add(new Teacher());
            x++;
        }
        //prints updated list
        System.out.println(teacherlist);
    }

    //function used to remove a teacher
    static void removeteacher(ArrayList teacherlist, int c){
        teacherlist.remove(c);
    }

    //function used to remove a student
    static void removestudent(ArrayList studentlist, int b){
        studentlist.remove(b);
    }

    //function used to add students
    static void addstudent(ArrayList studentlist, int i) {
        int y = 0;
        while (y < i){
            studentlist.add(new Student());
            y++;
        }
        //prints updated list
        System.out.println(studentlist);
}
    }


