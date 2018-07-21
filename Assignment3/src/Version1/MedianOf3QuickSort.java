package Version1;

import java.util.HashMap;

public class MedianOf3QuickSort {
    private int[] data = null;
    private int cntComparisons=0;
    private int cntSwaps=0;
    private HashMap<String,Integer> myMap= new HashMap<>();

    public MedianOf3QuickSort(int[] data){
        this.data=data;
        medianOf3QuickSort(data,0,data.length-1);

        myMap.put("comparisons",cntComparisons);
        myMap.put("swaps",cntSwaps);
    }

    public int[] getData(){
        return data;
    }

    public HashMap<String, Integer> getMyMap(){
        return myMap;
    }

    public void medianOf3QuickSort(int[] data, int p, int r){
        if (p < r) {
            medianOf3QuickSortSwap(data, p, r);
            int q = partition(data, p, r);

//            showStage();

            medianOf3QuickSort(data, p, q - 1);
            medianOf3QuickSort(data, q + 1, r);
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

    public void medianOf3QuickSortSwap(int[] data, int p, int r){

        // get middle number
        int first = data[p], last = data[r], mid = data[(p+r)/2];
        HashMap<Integer, Integer> hsMap = new HashMap<>();
        hsMap.put(first, p);
        hsMap.put(last, r);
        hsMap.put(mid, (p+r)/2);

        int[] getMiddleArray = new int[]{first, mid, last};
        QuickSort qs = new QuickSort(getMiddleArray);
        int middle = getMiddleArray[1];

        // calculate comparisons and swaps
        cntComparisons += qs.getMyMap().get("comparisons");
        cntSwaps += qs.getMyMap().get("swaps");

        cntComparisons++;
        if (middle != data[r]){
            cntComparisons++;
            if (hsMap.get(middle)!= r){
                cntSwaps++;
                int temp = data[r];
                data[r] = data[hsMap.get(middle)];
                data[hsMap.get(middle)]=temp;
            }
        }
    }

    public void showStage(){
        for (int i=0;i<this.data.length;i++)
            System.out.print(data[i]+" ");

        System.out.println();
    }
}
