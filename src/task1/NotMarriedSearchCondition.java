package task1;

public class NotMarriedSearchCondition implements IPersonSearchCondition {
    @Override
    public boolean isSatisfy(Person current) {
        return current.getSpouse() == null;
    }
}
