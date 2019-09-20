import java.util.*;

public class binaryTreeSum {
    public static boolean pathSum(TreeNode head, int sum) {
        if (head == null)
            return false;

        LinkedList<TreeNode> nodes = new LinkedList<TreeNode>();
        LinkedList<Integer> values = new LinkedList<Integer>();

        nodes.add(head);
        values.add(head.val);

        while (!nodes.isEmpty()) {
            TreeNode curr = nodes.poll();
            int sumOfValues = values.poll();

            if (curr.left == null && curr.right == null && sumOfValues == sum)
                return true;
            
            if(curr.left != null) {
                nodes.add(curr.left);
                values.add(sumOfValues + curr.left.val);

            }

            if(curr.right != null) {
                nodes.add(curr.right);
                values.add(sumOfValues + curr.right.val);
            }
        }

        return false;
    }

    public static void main (String args[]) {
        int sum1 = 22;
        int sum2 = 23;
        TreeNode head = new TreeNode(5);
        head.left = new TreeNode(4);
        head.right = new TreeNode(8);
        head.left.left = new TreeNode(11);
        head.right.left = new TreeNode(13);
        head.right.right = new TreeNode(4);
        head.left.left.left = new TreeNode(7);
        head.left.left.right = new TreeNode(2);
        head.right.right.right  = new TreeNode(1);

        System.out.println(pathSum(head, sum1));
        System.out.println(pathSum(head, sum2));
    }
}