import java.util.ArrayList;
import java.util.List;

public class BucketSort {

    private double[] data = null;
    private int bucket = 10;

    public BucketSort(double[] data){
        this.data=data;

        bucketSort();
    }

    private void bucketSort(){
        ArrayList<ArrayList<Double>> list=new ArrayList<>();

        // initialization
        for (int i=0;i<10;i++)
            list.add(new ArrayList<Double>());

        // put elements into ArrayList according to its value
        for (int i=0;i<data.length;i++)
            list.get((int)data[i]*10).add(data[i]);

        // do insertion sort in each bucket
        for (int i=0;i<10;i++)
            insertionSort(list.get(i));

        int index=0;
        for (List<Double> tmp: list)
            for (double iter: tmp)
                this.data[index++]=iter;

    }

    public void insertionSort(ArrayList<Double> list) {
        int i=0,j=0;

        for (i=1;i<list.size();i++){
            double temp=list.get(i);
            for (j=i;j>0 && list.get(j-1)>temp;j--) {
                list.set(j,list.get(j-1));
            }

            list.set(j, temp);
        }
    }
}
