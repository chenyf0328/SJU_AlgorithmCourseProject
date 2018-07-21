import java.util.HashMap;

public class MedianOfMedians {

    private int[] data = null;
    private int cntComparisons=0;
    private int cntSwaps=0;
    private HashMap<String,Integer> myMap= new HashMap<>();

    public MedianOfMedians(int[] data, int i){
        this.data=data;

        medianSelectionProblem(0, data.length-1, i);

//        System.out.println(medianSelectionProblem(0, data.length-1, i));

        myMap.put("comparisons",cntComparisons);
        myMap.put("swaps",cntSwaps);
    }

    public HashMap<String, Integer> getMyMap(){
        return myMap;
    }

    public int partition(int p, int r){
        int x = this.data[r];
        int i = p-1;
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

    public int medianOfMediansPartition(int p, int r){
        int initialR=r;
        int c=5;        //the size of each group
        while (r>p+1){
            int pos=p-1;
            int tmp=0;

            for (int start=p; start<=r;start+=c){
                int end = start + c - 1;

                cntComparisons++;
                if (end > r)
                    end = r;        //less than c elements

                //Sort the column by using insertion sort
                insertionSort(start, end);

                // Pick the column's median and promote it to the beginning of the array
                pos++;
                end = (start+end)/2;            //Median position
                tmp=this.data[end];
                this.data[end]=this.data[pos];
                this.data[pos]=tmp;

                cntSwaps++;
            }

            r = pos;
        }

        //swap the first element with the last element
        int temp=this.data[p];
        this.data[p]=this.data[initialR];
        this.data[initialR]=temp;

        cntSwaps++;

        return partition(p, initialR);
    }

    public int medianSelectionProblem(int p, int r, int i) {
        cntComparisons++;
        if (p == r)                     // in case that i is not in range of initial array size
            return this.data[p];

        int q = medianOfMediansPartition(p, r);
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
            return medianSelectionProblem(p, q - 1, i);
        }
        else {
            cntComparisons++;
            return medianSelectionProblem(q + 1, r, i - k);
        }
    }

    public void insertionSort (int p, int r) {
        int i=0,j=0;

        for (i=p+1;i<=r;i++){
            int temp=this.data[i];
            for (j=i;j>p && this.data[j-1]>temp;j--) {
                cntComparisons++;

                this.data[j] = this.data[j - 1];

                cntSwaps++;
            }
            cntComparisons++;

            this.data[j]=temp;

            cntSwaps++;
        }
    }
}
