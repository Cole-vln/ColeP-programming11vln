public class Teacher {
    //declare variables
        String tsubject;
        String tfirst;
        String tlast;
        int tcompetency;

        //assing default values to variables
        Teacher(){
            tsubject = "defaultsubject";
            tfirst = "defaultfirst";
            tlast = "defaultlast";
            tcompetency = 4;

        }

        //constructor
        public Teacher(String subject, String first, String last, int competency) {
            tsubject = subject;
            tfirst = first;
            tlast = last;
            tcompetency = competency;
        }

        //overrides toString method
        public String toString() {
            return "first name:" + this.tfirst + " last name:" + this.tlast + " subject:" + this.tsubject + " teacher competency out of 10:" + this.tcompetency + System.lineSeparator();

        }

    }
