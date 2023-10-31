
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
        System.out.print(", Surname: " + surname);
        System.out.print(", Condition: " + condition);
        System.out.print(", Birthday: " + birthday);
        System.out.print(", Salary: " + salary);
    }

    @Override
    public int compareTo(Teacher otherTeacher) {
        return this.surname.compareTo(otherTeacher.surname);
    }
}
