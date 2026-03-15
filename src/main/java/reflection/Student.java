package reflection;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

public class Student extends User implements Comparable{
    private int course;
    private List<String> subjects;
    private HashMap<String, List<Integer>> register;
    private Specialization specialization;


    public Student(String fullName, int age, String login, LocalDate lastLoginDate, boolean isActive,
                   String psw, int course, List<String> subjects, HashMap<String, List<Integer>> register,
                   Specialization specialization) {
        super(fullName, age, login, lastLoginDate, isActive, psw);
        this.course = course;
        this.subjects = subjects;
        this.register = register;
        this.specialization = specialization;
    }

    public Student(String fullName, int age, String login, LocalDate lastLoginDate, boolean isActive, String psw) {
        super(fullName, age, login, lastLoginDate, isActive, psw);
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }


    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public HashMap<String, List<Integer>> getRegister() {
        return register;
    }

    public void setRegister(HashMap<String, List<Integer>> register) {
        this.register = register;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + getFullName() + '\'' +  // из User
                ", age=" + getAge() +                   // из User
                ", login='" + getLogin() + '\'' +       // из User
                ", lastLoginDate=" + getLastLoginDate() + // из User
                ", isActive=" + isActive() +             // из User
                ", psw='" + getPsw() + '\'' +            // из User
                ", course=" + course +
                ", subjects=" + subjects +
                ", register=" + register +
                ", specialization=" + specialization +
                '}';
    }
}
