package Trees_Part2_Review;

public class TestTree2App {
    public static void main(String[] args) {
        MyTree2 tree=new MyTree2();
        int[] numbers=new int[] {10, 6, 8, 20};
        for (int i = 0; i <4; i++) {
            tree.insert(numbers[i]);
        }
        System.out.println(tree.contains(-5));
       MyTree2 tree2=new MyTree2();
        System.out.println(tree.contains(-5));
        System.out.println();
        tree.printLeaves(tree2.root);
        System.out.println("Height of root is: " + tree.height(tree.root));
        System.out.println(tree.sumOfNodes(tree.root));
        System.out.println("Number of leaves in the tree is :" + tree.countLeaves(tree.root));
        System.out.println("Sum of Leaves is : " + tree.findSumOfLeaves(tree.root));
        System.out.println("Sum of the nodes with the helper : " + tree.calculateNodeSums());
    }
}
