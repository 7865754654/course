package reflection;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

public interface Builder {

    Builder withFullName(String fullName);
    Builder withAge(int age);
    Builder withLogin(String login);
    Builder withLastLoginDate(LocalDate lastLoginDate);
    Builder withIsActive(boolean isActive);
    Builder withPassword(String psw);
    Builder withCourse(int course);
    Builder withSubjects(List<String> subjects);
    Builder withGradesForSubjects(HashMap<String, List<Integer>> register);
    Builder withSpecialization(Specialization specialization);
    Student createNewStudent();
}
