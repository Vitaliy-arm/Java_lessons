package Lessons6;

public class Students_6 {

    public Students_6(String stud_id, String stud_name, String stud_lastname, int stud_cours, double stud_math, double stud_econ, double stud_language) {

        student_id = stud_id;
        name = stud_name;
        lastname = stud_lastname;
        year = stud_cours;
        avr_math = stud_math;
        avr_econ = stud_econ;
        avr_language = stud_language;
    }

    Students_6(String stud_id1, String stud_name1, String stud_lastname1, int stud_cours1) {
        this(stud_id1, stud_name1, stud_lastname1, stud_cours1, 0, 0, 0);
    }

    Students_6() {
    }

    String student_id;
    String name;
    String lastname;
    int year;
    double avr_math;
    double avr_econ;
    double avr_language;


    static class StudentTest {

        double avr_aval(Students_6 st) {
            double avr_evaluations = (st.avr_econ + st.avr_language + st.avr_math) / 3;
            System.out.println("Средняя оценка студента " + st.name + " " + st.lastname + " - " + avr_evaluations);
            return avr_evaluations;
        }

        public static void main(String[] args) {
            Students_6 Michael = new Students_6();
            Michael.student_id = "st_12";
            Michael.name = "Michael";
            Michael.lastname = "Jonson";
            Michael.year = 3;
            Michael.avr_math = 4.5;
            Michael.avr_econ = 3.7;
            Michael.avr_language = 4.3;

            Students_6 Vera = new Students_6("st_24", "Vera", "Douwson", 2);
            Vera.avr_math = 3.8;
            Vera.avr_econ = 4.7;
            Vera.avr_language = 4.3;

            Students_6 Nick = new Students_6("st_2", "Nick","Yanowskiy",5, 4.8, 4.5, 4.9);

            StudentTest sTest = new StudentTest();
            sTest.avr_aval(Michael);
            sTest.avr_aval(Vera);
            sTest.avr_aval(Nick);
        }


    }

}
