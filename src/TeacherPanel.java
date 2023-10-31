import java.util.ArrayList;

public class TeacherPanel {
    public static void main(String[] args) {
        System.out.println("T E A C H E R   P A N E L");

        Teacher teacher1 = new Teacher("Karol", "Dziadkowiec", TeacherCondition.PRESENT, 2002, 4500);
        Teacher teacher2 = new Teacher("Cristiano", "Ronaldo", TeacherCondition.ABSENT, 1985, 3900);
        Teacher teacher3 = new Teacher("Leo", "Messi", TeacherCondition.DELEGATION, 1987, 4200);
        Teacher teacher4 = new Teacher("Robert", "Lewandowski", TeacherCondition.PRESENT, 1988, 4150);

        ArrayList<Teacher> teachers = new ArrayList<>();
        ClassTeacher classTeacher = new ClassTeacher("I High School", teachers, 25);

        System.out.println("\n\t/adding new teachers/");
        classTeacher.addTeacher(teacher1);
        classTeacher.addTeacher(teacher2);
        classTeacher.addTeacher(teacher3);
        classTeacher.addTeacher(teacher4);
        classTeacher.summary();

        System.out.println("\n\t/adding new salary for teacher Karol Dziadkowiec/");
        teacher1.printing();
        classTeacher.addSalary(teacher1, 5000);
        teacher1.printing();

        System.out.println("\n\t/removing teacher/");
        classTeacher.removeTeacher(teacher4);
        classTeacher.summary();

        System.out.println("\n\t/changing teacher condition/");
        teacher3.printing();
        classTeacher.changeCondition(teacher3, TeacherCondition.DELEGATION);
        teacher3.printing();

        System.out.println("\n\t/searching for a teacher/");
        String teacherSurname = "Dziadkowiec";
        Teacher searchedTeacher = classTeacher.search(teacherSurname);
        if (searchedTeacher != null) {
            System.out.println("Teacher " + teacherSurname + " was successfully found.");
            searchedTeacher.printing();
        }
        else {
            System.out.println("Teacher wasn't found.");
        }

        System.out.println("\n\t/searching for a teacher by partial string \"a\"/");
        String partialString = "a";
        ArrayList<Teacher> matchingTeachers = classTeacher.searchPartial(partialString);
        for (Teacher teacher : matchingTeachers) {
            teacher.printing();
        }

        System.out.println("\n\t/counting by condition/");
        int conditionCounter = classTeacher.countByCondition(TeacherCondition.DELEGATION);
        System.out.println("Counted delegation condition = " + conditionCounter);

        System.out.println("\n\t/testing summary method/");
        classTeacher.summary();

        System.out.println("\n\t/sorting alphabetically by name/");
        classTeacher.sortByName();
        classTeacher.summary();

        System.out.println("\n\t/sorting alphabetically by name/");
        classTeacher.sortBySalary();
        classTeacher.summary();



    }
}