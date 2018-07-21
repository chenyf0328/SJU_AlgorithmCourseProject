import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class HuffmanTree<E> {

    private Node<E> root;
    private double totalWeight;
    private ArrayList<Node<E>> records = new ArrayList<>();
    private ArrayList<Node<E>> weplRecords = new ArrayList<>();

    public Node<E> getRoot() {
        return root;
    }

    public ArrayList<Node<E>> getWeplRecords() {
        return weplRecords;
    }

    public ArrayList<Node<E>> getRecords() {
        return records;
    }

    public HuffmanTree(int n, E[] ch, int[] f){
        root = huff(n, ch, f);

        // calculate total weight
        for (int iter: f){
            totalWeight += iter;
    }

        code(root);
        wepl(root, 0);
    }

    public Node<E> huff(int n, E[] ch, int[] f){
        PriorityQueue<Node<E>> pq = new PriorityQueue<>();
        for (Node<E> iter: generateList(ch, f))
            pq.add(iter);

        while (pq.size()>1) {
            Node<E> left = pq.poll();
            Node<E> right = pq.poll();
            Node<E> parent = new Node<E>(ch[ch.length-1], left.getWeight() + right.getWeight());
            parent.setLeft(left);
            parent.setRight(right);

            left.setCode("0");
            right.setCode("1");

            pq.add(parent);
        }

        return pq.peek();
    }

    private List<Node<E>> generateList(E[] ch, int[] f){
        List<Node<E>> nodeList = new ArrayList<>();
        for (int i=0;i<ch.length-1;i++)
            nodeList.add(new Node(ch[i],f[i]));

        return nodeList;
    }

    public void printTree(){
        BTreePrinter bTreePrinter=new BTreePrinter();
        bTreePrinter.printNode(root);
        System.out.print(bTreePrinter.getString());
    }

    public void code(Node<E> root){
        if (root.getLeft()==null && root.getRight()==null){

//            // Test
//            System.out.println(root.getData()+": "+root.getHcode());

            records.add(root);

            return;
        }

        root.getLeft().setHcode(root.getHcode()+root.getLeft().getCode());
        code(root.getLeft());
        root.getRight().setHcode(root.getHcode()+root.getRight().getCode());
        code(root.getRight());
    }

    public void wepl(Node<E> root, int pathLength){
        if (root.getLeft()==null && root.getRight()==null){
            root.setPathLength(pathLength);
            root.setWeightedAvg(root.getWeight()/totalWeight);
            root.setSavingAvg(root.getHcode().length()/16.0);                 // assume the fixed length of binary code is 16
            weplRecords.add(root);
            return;
        }

        pathLength++;
        wepl(root.getLeft(), pathLength);
        wepl(root.getRight(), pathLength);
    }
}
