import java.util.ArrayList;

public class Student {
    //declare variables
    private String sgrade;
    private String sfirst;
    private String slast;
    private String smark;
    private int sage;
    private int sid;
    private static int counter = 45;
    Student(){
        //assign default values to variables
        sgrade = "defaultgrade";
        sfirst = "defaultfirst";
        slast = "defaultlast";
        smark = "B-";
        sage = 17;
        sid = counter;
        //increases the value of couter by one
        counter++;

    }

    //constructor
    public Student(String grade, String first, String last, String mark, int id, int age) {
        sgrade = grade;
        sfirst = first;
        slast = last;
        smark = mark;
        sid = id;
        sage = age;
    }

    //overrides toString method
    public String toString() {
        return "student first name:" + this.sfirst + " student last name:" + this.slast + " student grade:" + this.sgrade + " student mark:" + this.smark + this.sid + " student age:" + this.sage + System.lineSeparator();

    }

    //getters and setters
    public String getSgrade() {
        return sgrade;
    }

    public void setSgrade(String sgrade) {
        this.sgrade = sgrade;
    }

    public String getSfirst() {
        return sfirst;
    }

    public void setSfirst(String sfirst) {
        this.sfirst = sfirst;
    }

    public String getSlast() {
        return slast;
    }

    public void setSlast(String slast) {
        this.slast = slast;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
}
