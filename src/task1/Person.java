package task1;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
        if (spouse.getSpouse() == null)
            spouse.setSpouse(this);
        spouse.setChildren(this.children);
    }

    private List<Person> children;
    private Person spouse;
//    private List<Person> parent;

    public void addChild(Person child) {
        if (children == null)
            children = new ArrayList<>();
        children.add(child);
        spouse.setChildren(this.children);
    }
}
