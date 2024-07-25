public class ArrayBasedBinarySearchTree extends ArrayBasedBinaryTree{

    public ArrayBasedBinarySearchTree() {
        super();
    }

    public void insert(Integer value){
        insRec(value, root);
        size++;
    }
    
    public void insRec(Integer value, Integer root){
        if(data[root]==null){
            data[root] = value;
            return;
        }
        if(value.compareTo(data[root])<=0){
            insRec(root, getLeft(root));
        }else{
            insRec(root, getRight(root));
        }
    }

    public static void main(String[] args) {
        ArrayBasedBinarySearchTree emptyTree = new ArrayBasedBinarySearchTree();
        
        ArrayBasedBinarySearchTree myTree = new ArrayBasedBinarySearchTree();
        myTree.insert(2);
        myTree.insert(1);
        myTree.insert(5);
        myTree.insert(7);
        myTree.insert(0);
        myTree.insert(4);
        myTree.insert(6);
        
        System.out.println("in");
        myTree.inOrder();
        System.out.println("pre");
        myTree.preOrder();
        System.out.println("post");
        myTree.postOrder();
        
        System.out.println("toString\n" + myTree);
    }

}
