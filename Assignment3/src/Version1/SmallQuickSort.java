package Version1;

import java.util.HashMap;

public class SmallQuickSort {
    private int[] data = null;
    private int cntComparisons=0;
    private int cntSwaps=0;
    private HashMap<String,Integer> myMap= new HashMap<>();

    public SmallQuickSort(int[] data){
        this.data=data;
        quickSort(data,0,data.length-1);

        myMap.put("comparisons",cntComparisons);
        myMap.put("swaps",cntSwaps);
    }

    public int[] getData(){
        return data;
    }

    public HashMap<String, Integer> getMyMap(){
        return myMap;
    }

    public void quickSort(int[] data, int p, int r){
        if (p < r) {
            int q = partition(this.data, p, r);

//            showStage();

            if (q-p>20)
                quickSort(data, p, q - 1);
            else
                insertionSort(data, p, q-1);

            if (r-q>20)
                quickSort(data, q + 1, r);
            else
                insertionSort(data, q+1, r);
        }
//        showStage();
    }

    public void insertionSort (int A[], int p, int r) {
        int i=0,j=0;

        for (i=p+1;i<=r;i++){
            int temp=A[i];
            for (j=i;j>p && A[j-1]>temp;j--) {
                // count comparisons
                cntComparisons++;

                A[j] = A[j - 1];

                // count swaps
                cntSwaps++;
            }
            // count comparisons
            cntComparisons++;

            A[j]=temp;

            // count swaps
            cntSwaps++;
        }
    }

    public int partition(int[] data, int p, int r){
        int x = data[r];
        int i=p-1;
        for (int j=p;j<r;j++){
            cntComparisons++;
            if (data[j]<=x){
                i++;

                // swap data[i] and data[j]
                int temp=data[i];
                data[i]=data[j];
                data[j]=temp;

                cntSwaps++;
            }
        }

        // swap data[i+1] and data[r]
        int temp=data[i+1];
        data[i+1]=data[r];
        data[r]=temp;

        cntSwaps++;

        return i+1;
    }

    public void showStage(){
        for (int i=0;i<this.data.length;i++)
            System.out.print(data[i]+" ");

        System.out.println();
    }
}
