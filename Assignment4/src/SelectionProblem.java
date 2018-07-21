import java.util.HashMap;

public class SelectionProblem {

    private int[] data = null;
    private int cntComparisons=0;
    private int cntSwaps=0;
    private HashMap<String,Integer> myMap= new HashMap<>();

    public SelectionProblem(int[] data, int i){
        this.data=data;
//        System.out.println(selectionProblem(0, data.length-1, i));

        selectionProblem(0, data.length-1, i);

        myMap.put("comparisons",cntComparisons);
        myMap.put("swaps",cntSwaps);
    }

    public HashMap<String, Integer> getMyMap(){
        return myMap;
    }

    public int partition(int p, int r){
        int x = this.data[r];
        int i=p-1;
        for (int j=p;j<r;j++){
            cntComparisons++;
            if (this.data[j]<=x){
                i++;

                // swap data[i] and data[j]
                int temp=this.data[i];
                this.data[i]=this.data[j];
                this.data[j]=temp;

                cntSwaps++;
            }
        }

        // swap data[i+1] and data[r]
        int temp=this.data[i+1];
        this.data[i+1]=this.data[r];
        this.data[r]=temp;

        cntSwaps++;

        return i+1;
    }

    public int randomizedPartition(int p, int r){
        int i = (int) ((Math.random()*(r-p+1))+p);
        int temp=this.data[i];
        this.data[i]=this.data[r];
        this.data[r]=temp;

        cntSwaps++;

        return partition(p, r);
    }

    public int selectionProblem(int p, int r, int i) {
        cntComparisons++;
        if (p == r)
            return this.data[p];

        int q = randomizedPartition(p, r);
        int k = q - p + 1;

        cntComparisons++;
        if (i == k)
            return this.data[q];
        else if (i < k) {
            cntComparisons++;

            if (q == 0) {
                cntComparisons++;

                return this.data[0];
            }
            return selectionProblem(p, q - 1, i);
        }
        else {
            cntComparisons++;
            return selectionProblem(q + 1, r, i - k);
        }
    }
}
