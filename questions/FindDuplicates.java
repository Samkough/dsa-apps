import java.util.*;

public class FindDuplicates {
    public static List<Integer> returnDuplicates(List<Integer> nums) {
        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> numSet = new HashSet<>();

        for (Integer num : nums) {
            if(!numSet.add(num))
                duplicates.add(num);
        }

        if (duplicates.size() == 0)
            return null;
        else
            return duplicates;
    }

    public static void main (String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(1);
        list1.add(7);
        list1.add(8);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(1);
        list2.add(2);
        list2.add(8);

        List<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add(3);
        list3.add(1);
        list3.add(2);
        list3.add(8);
        list3.add(1);
        list3.add(8);

        System.out.println(returnDuplicates(list1));
        System.out.println(returnDuplicates(list2));
        System.out.println(returnDuplicates(list3));
    }
}