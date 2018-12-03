package task1;

public class TwoChildrenSearchCondition implements IPersonSearchCondition {
    @Override
    public boolean isSatisfy(Person current) {
        return current.getChildren() == null ?
                false : current.getChildren().size() == 2;
    }
}
