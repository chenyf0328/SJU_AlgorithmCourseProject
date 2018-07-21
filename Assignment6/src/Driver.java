public class Driver {
    public static void main (String[] args) {
//        // small input which has 8 inputs
//        Character[] ch = new Character[]{'A','B','C','D','E','F','G','H','#'};
//        int[] frequency = new int[]{8000,1600,3000,4400,12000,2500,1700,6400};

//        // 26 inputs version 1
        Character[] ch = new Character[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','#'};
        int[] frequency = new int[]{8000,1600,3000,4400,12000,2500,1700,6400,8000,400,800,4000,3000,8000,8000,1700,500,6200,8000,9000,3400,1200,2000,400,2000,200};

//        // 26 inputs version 2
//        Character[] ch = new Character[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','#'};
//        int[] frequency = new int[]{57,11,23,17,57,9,13,15,38,1,6,28,15,34,37,16,1,39,29,35,19,5,7,1,9,1};

        HuffmanTree<Character> huffmanTree = new HuffmanTree(26, ch, frequency);

        // show the printTree() function
        System.out.println("Test printTree() methods:");
        huffmanTree.printTree();

        // show records that code() function generates
        System.out.println("Test code() methods:");
        for (Node iter: huffmanTree.getRecords()){
            System.out.println("character: "+ iter.getData() + ", frequency: "+iter.getWeight() + " code: " + iter.getHcode());
        }

        // show wepl() function's result
        System.out.println("Test wepl() methods:");
        for (Node iter: huffmanTree.getWeplRecords()){
            System.out.printf("character: %c, weighted average: %.2f, path length of leaves: %d, percent saving: %.2f",
                    iter.getData(), iter.getWeightedAvg()*100, iter.getPathLength(), iter.getSavingAvg()*100);
            System.out.println();
        }
    }
}
