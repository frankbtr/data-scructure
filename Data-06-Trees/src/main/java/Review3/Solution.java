package Review3;

public class Solution {
    public static void main(String[] args) {
        Tree myTree=new Tree();
        myTree.insert(3);
        myTree.insert(1);
        myTree.insert(5);
        myTree.insert(0);
        myTree.insert(2);
        myTree.insert(4);
        myTree.insert(6);
        myTree.insert(8);
        myTree.insert(7);
        System.out.println("Binary Tree");
        VisualizeTree.printTree(myTree.getRoot(), null,false);
        System.out.println(myTree.find_path(7).toString());
        System.out.println("End of program");
    }
}