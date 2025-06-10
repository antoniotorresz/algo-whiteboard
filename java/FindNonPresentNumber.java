import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindNonPresentNumber {

    static class Foo {
        private Integer bar;

        public Foo(){}
    }

    public static void main(String[] args) {
        // Set<Integer> originalNumbers = new HashSet<>(List.of(7,6,4,5,3,2,9,8,1));
        // originalNumbers.removeAll(List.of(6,4,3,7,2,9,8,5));
        // System.out.println(originalNumbers.toString());
        Foo foo = new Foo();
        System.out.println(foo != null);
    }
}