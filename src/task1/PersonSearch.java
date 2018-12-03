package task1;

import java.util.ArrayList;
import java.util.List;

public class PersonSearch {

    public static List<Person> Search(IPersonSearchCondition condition, Person root){
        List<Person> re = new ArrayList<>();
        doSearch(root, condition, re);
        return re;
    }

    private static void doSearch(Person current,
                                 IPersonSearchCondition condition,
                                 List<Person> result){
        if (current == null)
            return;
        if (condition.isSatisfy(current))
            result.add(current);
        if (current.getChildren() != null)
            for (Person child : current.getChildren())
                doSearch(child, condition, result);
    }
}
