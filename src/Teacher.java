
public class Teacher implements Comparable<Teacher>{
    String name;
    String surname;
    TeacherCondition condition;
    Integer birthday;
    double salary;
    public Teacher(String name, String surname, TeacherCondition condition, Integer birthday, double salary) {
       this.name = name;
       this.surname = surname;
       this.condition = condition;
       this.birthday = birthday;
       this.salary = salary;
    }

    public void printing() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Condition: " + condition);
        System.out.println("Birthday: " + birthday);
        System.out.println("Salary: " + salary);
    }

    @Override
    public int compareTo(Teacher otherTeacher) {
        return this.surname.compareTo(otherTeacher.surname);
    }
}
