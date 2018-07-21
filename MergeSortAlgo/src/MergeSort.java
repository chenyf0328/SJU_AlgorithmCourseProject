public class MergeSort {
    public static void mergeSort(int[] data, int left, int right){
        if (left<right){
            int half=(left+right)/2;
            mergeSort(data,left,half);
            mergeSort(data,half+1,right);
            merge(data,left,right);
        }
    }

    public static void merge(int[] data, int left, int right){
        int mid=(left+right)/2;
        int i=left;
        int j=mid+1;
        int count=0;
        int[] temp=new int[right-left+1];
        while(i<=mid && j<=right){
            if (data[i]<data[j])
                temp[count++]=data[i++];
            else
                temp[count++]=data[j++];
        }

        while (i<=mid){
            temp[count++]=data[i++];
        }

        while (j<=right){
            temp[count++]=data[j++];
        }

        count=0;
        while (left<=right){
            data[left++]=temp[count++];
        }
    }

    public static void main(String args[]){
        int[] data=new int[]{2,4,12,2,8,3,5,10};
        mergeSort(data,0,data.length-1);

        for (int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
    }
}
