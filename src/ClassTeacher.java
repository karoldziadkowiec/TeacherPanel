import java.util.ArrayList;

public class ClassTeacher {
    String groupName;
    ArrayList<Teacher>teacherList = new ArrayList<Teacher>();
    int maxNumberOfTeachers;

    public ClassTeacher(String groupName, int maxNumberOfTeachers) {
        this.groupName = groupName;
        this.maxNumberOfTeachers = maxNumberOfTeachers;
        this.teacherList = new ArrayList<>();
    }

    public void addTeacher(Teacher newTeacher) {
        if (teacherList.contains(newTeacher)) {
            System.out.println("Teacher " + newTeacher.name + " " + newTeacher.surname + " is already present in the group.");
            return;
        }

        if (teacherList.size() < maxNumberOfTeachers) {
            teacherList.add(newTeacher);
            System.out.println("Teacher " + newTeacher.name + " " + newTeacher.surname + " has been added to the group.");
        }
        else {
            System.out.println("Error. Cannot add teacher, maximum number of teachers in group reached.");
        }
    }

    public void addSalary(Teacher teacher, double newSalary) {
        if (teacherList.contains(teacher)) {
            teacher.salary = newSalary;
            System.out.println("Added salary: " + teacher.salary + " for teacher:" + teacher.name + " " + teacher.surname);
        }
        else {
            System.out.println("Error. Teacher " + teacher.name + " " + teacher.surname + " does not exist.");
        }
    }

    public void removeTeacher(Teacher teacher) {
        if (teacherList.contains(teacher)) {
            teacherList.remove(teacher);
            System.out.println("Teacher " + teacher.name + " " + teacher.surname + " has been removed.");
        }
        else {
            System.out.println("Error. Teacher " + teacher.name + " " + teacher.surname + " does not exist.");
        }
    }

    public void changeCondition(Teacher teacher, TeacherCondition newCondition) {
        if (teacherList.contains(teacher)) {
            teacher.condition = newCondition;
            System.out.println("Teacher " + teacher.name + " " + teacher.surname + " has been set to: " + teacher.condition);
        }
        else {
            System.out.println("Error. Teacher " + teacher.name + " " + teacher.surname + " does not exist.");
        }
    }

    public void search() {

    }

    public void searchPartial() {

    }

    public void countByCondition() {

    }

    public void summary() {

    }

    public void sortByName() {

    }

    public void sortBySalary() {

    }

    public void max() {

    }
}
