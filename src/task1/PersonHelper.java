package task1;

import java.util.ArrayList;
import java.util.List;

public class PersonHelper {
    public static List<Person> searchNotMarried(Person root) {
        if (root == null)
            return null;
        List<Person> re = new ArrayList<>();
        doSearchNotMarried(root, re);
        return re;
    }

    private static void doSearchNotMarried(Person current, List<Person> re) {
        if (current.getSpouse() == null)
            re.add(current);
        if (current.getChildren() != null)
            for (Person child : current.getChildren())
                doSearchNotMarried(child, re);
    }

    public static List<Person> searchCouple(Person root) {
        if (root == null)
            return null;
        List<Person> re = new ArrayList<>();
        doSearchCouple(root, re);
        return re;
    }

    private static void doSearchCouple(Person current, List<Person> re) {
        if (current.getSpouse() == null || current.getChildren() == null)
            return;
        if (current.getChildren().size() == 2)
            re.add(current);
        for (Person child : current.getChildren())
            doSearchCouple(child, re);
    }
}
