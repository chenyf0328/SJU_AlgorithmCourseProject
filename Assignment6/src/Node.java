public class Node<E> implements Comparable<Node<E>> {
    private E data;
    private int weight;
    private Node<E> left;
    private Node<E> right;
    private String Hcode;
    private String code;
    private int pathLength;

    public double getSavingAvg() {
        return savingAvg;
    }

    public void setSavingAvg(double savingAvg) {
        this.savingAvg = savingAvg;
    }

    private double savingAvg;

    public double getWeightedAvg() {
        return weightedAvg;
    }

    public void setWeightedAvg(double weightedAvg) {
        this.weightedAvg = weightedAvg;
    }

    private double weightedAvg;

    public int getPathLength() {
        return pathLength;
    }

    public void setPathLength(int pathLength) {
        this.pathLength = pathLength;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Node(E data, int weight){
        this.data=data;
        this.weight=weight;
        this.Hcode="";
        this.code="";
    }

    public E getData() {
        return data;
    }

    public int getWeight() {
        return weight;
    }

    public Node<E> getLeft() {
        return left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setData(E data) {
        this.data = data;
    }

    public String getHcode() {
        return Hcode;
    }

    public void setHcode(String hcode) {
        Hcode = hcode;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }

    @Override
    public int compareTo(Node<E> node){
        if (node.weight>this.weight)
            return -1;
        else if (node.weight<this.weight)
            return 1;
        else
            return 0;

        // can just use: return this.weight - node.weight
    }


}
