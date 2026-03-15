package reflection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Director {
    public Builder createStudentIt(Builder builder) {
        List<String> listSubjects = new ArrayList<>();
        listSubjects.add("math");
        listSubjects.add("chemistry");
        listSubjects.add("physics");
        builder.withSubjects(listSubjects);
        List<Integer> listGrades = new ArrayList<>();
        listGrades.add(4);
        listGrades.add(5);
        listGrades.add(5);
        listGrades.add(4);
        HashMap<String, List<Integer>> listRegister = new HashMap<>();
        listRegister.put("math", listGrades);
        listRegister.put("chemistry", listGrades);
        listRegister.put("physics", listGrades);
        builder.withGradesForSubjects(listRegister);
        return builder;
    }
    public Builder createStudentEngineer(Builder builder) {
        List<String> listSubjects = new ArrayList<>();
        listSubjects.add("math");
        listSubjects.add("physics");
        listSubjects.add("Astronomy");
        builder.withSubjects(listSubjects);
        List<Integer> listGrades = new ArrayList<>();
        listGrades.add(4);
        listGrades.add(3);
        listGrades.add(4);
        listGrades.add(4);
        HashMap<String, List<Integer>> listRegister = new HashMap<>();
        listRegister.put("Astronomy", listGrades);
        builder.withGradesForSubjects(listRegister);
        return builder;
    }
}
