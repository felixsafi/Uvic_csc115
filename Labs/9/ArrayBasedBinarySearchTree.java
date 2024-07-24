public class ArrayBasedBinarySearchTree extends ArrayBasedBinaryTree{

    public ArrayBasedBinarySearchTree() {
        super();
    }

    public void insert(Integer value){
         //if the tree is empty
         if(!isLeaf(this.root)){
            insRec(value, root, true);
            size++;
            
        //else, Call Recursive add method, then update size
        }else{
            data[root]=value;
            size++;
        }
    }
    
    //lr bool stands for left(true)/right(false)
    public void insRec(Integer value, Integer root, boolean lr){
        if(isLeaf(root)){
            return;
        }
        if(comparer(root)<=0){
            insRec(root, getLeft(root), true);
        }else{
            insRec(root, getRight(root), false);
        }

        if(lr){
            data[getLeft(root)] = value;
        }else{
            data[getRight(root)] = value;
        }
    }

    public int comparer(Integer index){
        return data[getLeft(root)].compareTo(data[getRight(root)]);
    }

    public boolean isLeaf(Integer parent){
        return (Math.max(getLeft(root), getRight(root))>size);
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
