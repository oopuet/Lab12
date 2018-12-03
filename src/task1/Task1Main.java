package task1;

import java.util.List;

public class Task1Main {
    public static void main(String[] args) {
        Person Bob = new Person("Bob");
        Person Alice = new Person("Alice");
        Bob.setSpouse(Alice);

        Person Tom = new Person("Tom");
        Person Mark = new Person("Mark");

        Person Ted = new Person("Ted");
        Tom.setSpouse(Ted);

        Bob.addChild(Tom);
        Bob.addChild(Mark);

        List<Person> result1 = PersonHelper.searchNotMarried(Bob);
        List<Person> result2 = PersonHelper.searchCouple(Bob);

        IPersonSearchCondition notMarriedCondition = new NotMarriedSearchCondition();
        List<Person> result3 = PersonSearch.Search(notMarriedCondition, Bob);

        IPersonSearchCondition condition2 = new TwoChildrenSearchCondition();
        List<Person> result4 = PersonSearch.Search(condition2, Bob);

        System.out.println(result4.size());
    }


}
