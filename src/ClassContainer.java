import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ClassContainer {
    Map<String, ClassTeacher> teacherGroups = new HashMap<>();

    public void addClass(String groupName, int limitGroup) {
        ClassTeacher group = new ClassTeacher(groupName, limitGroup);
        teacherGroups.put(groupName, group);
        System.out.println("The group has been created.");
    }

    public void removeClass(String groupName) {
        if (teacherGroups.containsKey(groupName)) {
            teacherGroups.remove(groupName);
            System.out.println("Group " + groupName + " has been removed");
        }
        else {
            System.out.println("Error: Group " + groupName + " does not exist.");
        }
    }

    public ArrayList<ClassTeacher> findEmpty() {
        ArrayList<ClassTeacher> emptyGroups = new ArrayList<>();

    }
}
