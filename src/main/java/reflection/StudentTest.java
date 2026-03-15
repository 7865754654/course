package reflection;

import java.time.LocalDate;

public class StudentTest {
    public static void main(String[] args) {
        Builder user1 = new BuilderStudent("Ivan", 16, "ivanZOLO2004",
                LocalDate.of(1995, 12, 25), true, "12345670");
        Director director = new Director();

        user1.withCourse(4);

        user1.withSpecialization(Specialization.INFORMATION_TECHNOLOGY);

        Specialization specialization = user1.createNewStudent().getSpecialization();

        switch (specialization) {
            case INFORMATION_TECHNOLOGY ->  director.createStudentIt(user1);
            case SOFTWARE_ENGINEERING ->  director.createStudentEngineer(user1);
        }

        System.out.println(user1.createNewStudent());

    }
}
