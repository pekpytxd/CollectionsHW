import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set s1 = new HashSet();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        Set s2 = new HashSet();
        s2.add(3);
        s2.add(1);
        s2.add(6);
        s2.add(8);
        s2.add(0);
        OperationsSets obj = new OperationsSets();
        Set union = obj.union(s1, s2);
        Set intersect = obj.intersect(s1, s2);
        System.out.println(union);
        System.out.println(intersect);
    }

}
