package reflection;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

public class BuilderStudent extends Student implements Builder{

    public BuilderStudent(String fullName, int age, String login, LocalDate lastLoginDate, boolean isActive, String psw) {
        super(fullName, age, login, lastLoginDate, isActive, psw);
    }

    @Override
    public Builder withFullName(String fullName) {
        setFullName(fullName);
        return this;
    }

    @Override
    public Builder withAge(int age) {
        setAge(age);
        return this;
    }

    @Override
    public Builder withLogin(String login) {
        setLogin(login);
        return this;
    }

    @Override
    public Builder withLastLoginDate(LocalDate lastLoginDate) {
        setLastLoginDate(lastLoginDate);
        return this;
    }

    @Override
    public Builder withIsActive(boolean isActive) {
        setActive(isActive);
        return this;
    }

    @Override
    public Builder withPassword(String psw) {
        setPsw(psw);
        return this;
    }

    @Override
    public Builder withCourse(int course) {
        setCourse(course);
        return this;
    }

    @Override
    public Builder withSubjects(List<String> subjects) {
        setSubjects(subjects);
        return this;
    }

    @Override
    public Builder withGradesForSubjects(HashMap<String, List<Integer>> register) {
        setRegister(register);
        return this;
    }

    @Override
    public Builder withSpecialization(Specialization specialization) {
        setSpecialization(specialization);
        return this;
    }

    @Override
    public Student createNewStudent() {
        return this;
    }

}
