import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ClassTeacher {
    String groupName;
    ArrayList<Teacher>teacherList = new ArrayList<Teacher>();
    int maxNumberOfTeachers;

    public ClassTeacher(String groupName, ArrayList<Teacher>teacherList, int maxNumberOfTeachers) {
        this.groupName = groupName;
        this.maxNumberOfTeachers = maxNumberOfTeachers;
        this.teacherList = teacherList;
    }

    public ClassTeacher(String groupName, int maxNumberOfTeachers) {
        this.groupName = groupName;
        this.maxNumberOfTeachers = maxNumberOfTeachers;
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
            System.out.println("The salary " + teacher.salary + " zł. has been added for teacher: " + teacher.name + " " + teacher.surname);
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
            System.out.println("Teacher condition of " + teacher.name + " " + teacher.surname + " has been set to: " + teacher.condition);
        }
        else {
            System.out.println("Error. Teacher " + teacher.name + " " + teacher.surname + " does not exist.");
        }
    }

    public Teacher search(String surname) {
        for(Teacher teacher : teacherList) {
            String teacherSurname = teacher.surname;
            if(teacherSurname.compareTo(surname) == 0 ) {
                return teacher;
            }
        }
        return null;
    }

    public ArrayList<Teacher> searchPartial(String partialString) {
        ArrayList<Teacher> matchingTeachers = new ArrayList<>();

        for (Teacher teacher : teacherList) {
            String teacherName = teacher.name;
            String teacherSurname = teacher.surname;

            if (teacherName.contains(partialString) || teacherSurname.contains(partialString)) {
                matchingTeachers.add(teacher);
            }
        }
        return matchingTeachers;
    }

    public int countByCondition(TeacherCondition searchedCondition) {
        int counter = 0;
        for(Teacher teacher : teacherList) {
            TeacherCondition teacherCondition = teacher.condition;
            if(teacherCondition.compareTo(searchedCondition) == 0 ) {
                counter++;
            }
        }
        return counter;
    }

    public void summary() {
        System.out.println("Summary of all teachers:");
        for(Teacher teacher : teacherList) {
            teacher.printing();
        }
    }

    public ArrayList<Teacher> sortByName() {
        ArrayList<Teacher> sortedList = teacherList;
        sortedList.sort(Teacher::compareTo);
        return sortedList;
    }

    public ArrayList<Teacher> sortBySalary() {
        ArrayList<Teacher> sortedList = teacherList;
        Comparator<Teacher> myComparator = new Comparator<Teacher>() {
            @Override
            public int compare(Teacher t1, Teacher t2) {
                return Double.compare(t1.salary, t2.salary);
            }
        };
        sortedList.sort(Collections.reverseOrder(myComparator));
        return sortedList;
    }

    public Teacher max() {
        Teacher teacher = Collections.max(teacherList, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher t1, Teacher t2) {
                return Double.compare(t1.salary, t2.salary);
            }
        });
        return teacher;
    }
}