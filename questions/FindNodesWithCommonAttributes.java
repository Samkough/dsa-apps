package questions;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/*
there are two levels to this question:
- find nodes with zero or one parent
- find nodes with common ancestors
*/

public class FindNodesWithCommonAttributes {
    public static List<List<Integer>> findNodesWithZeroAndOneParents(int[][] parentChildPairs) {
        List<List<Integer>> results = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        // add parentChildPairs to map
        for (int i = 0; i < parentChildPairs.length; i++) {
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            map.put(parentChildPairs[i][0], list1);
            map.put(parentChildPairs[i][1], list2);
        }

        System.out.println(map);

        for (int i = 0; i < parentChildPairs.length; i++) {
            List<Integer> list = map.get(parentChildPairs[i][1]);
            list.add(parentChildPairs[i][0]);
            map.put(parentChildPairs[i][1], list);
        }

        System.out.println(map);

        // iterate through map and add to list
        List<Integer> zeroParents = new ArrayList<>();
        List<Integer> oneParent = new ArrayList<>();
        results.add(zeroParents);
        results.add(oneParent);

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if (entry.getValue().isEmpty()) {
                zeroParents.add(entry.getKey());
            } else if (entry.getValue().size() == 1) {
                oneParent.add(entry.getKey());
            }
        }

        return results;
    }

    public static boolean findNodesWithCommonAncestors(int[][] parentChildPairs, int nodeOne, int nodeTwo) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        // add parentChildPairs to map
        for (int i = 0; i < parentChildPairs.length; i++) {
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            map.put(parentChildPairs[i][0], list1);
            map.put(parentChildPairs[i][1], list2);
        }

        for (int i = 0; i < parentChildPairs.length; i++) {
            List<Integer> list = map.get(parentChildPairs[i][1]);
            list.add(parentChildPairs[i][0]);
            // add parent's and ancestor's list through BFS
            map.put(parentChildPairs[i][1], list);
        }

        System.out.println(map);

        // iterate through one node's ancestor list and try to find if it shares common
        // ancestors with the other node

        return false;
    }

    public static void main(String args[]) {
        int[][] parentChildPairs1 = new int[][] { { 1, 3 }, { 2, 3 }, { 3, 6 }, { 5, 6 }, { 5, 7 }, { 4, 5 }, { 4, 8 },
                { 4, 9 }, { 9, 11 }, { 14, 4 }, { 13, 12 }, { 12, 9 } };
        System.out.println(findNodesWithZeroAndOneParents(parentChildPairs1));

        int node1 = 3, node2 = 8;
        System.out.println(findNodesWithCommonAncestors(parentChildPairs1, node1, node2));
        node1 = 6;
        node2 = 8;
        System.out.println(findNodesWithCommonAncestors(parentChildPairs1, node1, node2));
        node1 = 1;
        node2 = 3;
        System.out.println(findNodesWithCommonAncestors(parentChildPairs1, node1, node2));
        node1 = 7;
        node2 = 11;
        System.out.println(findNodesWithCommonAncestors(parentChildPairs1, node1, node2));

        int[][] parentChildPairs2 = new int[][] { { 1, 3 }, { 11, 10 }, { 11, 12 }, { 2, 3 }, { 10, 2 }, { 10, 5 },
                { 3, 4 }, { 5, 6 }, { 5, 7 }, { 7, 8 } };
        node1 = 4;
        node2 = 12;
        System.out.println(findNodesWithCommonAncestors(parentChildPairs2, node1, node2));
        node1 = 1;
        node2 = 12;
        System.out.println(findNodesWithCommonAncestors(parentChildPairs2, node1, node2));
        node1 = 1;
        node2 = 6;
        System.out.println(findNodesWithCommonAncestors(parentChildPairs2, node1, node2));
    }
}
