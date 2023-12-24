package bubblesort;

public class BubbleSort {

    static int[] bubbleSort(int arr[],int n)
    {
        for (int i=n-1;i>0;i--){
	for (int j=0;j<i;j++){
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        }
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int dizi[]={3,2,1,5,6,4,9,7,8};
	int n= dizi.length;
	for (int ii=0;ii<n;ii++)
	{
	    System.out.print(dizi[ii]+" ");
	}
	
	bubbleSort(dizi,n);
	
	System.out.println("");
	for (int ii=0;ii<n;ii++)
	{
	System.out.print(dizi[ii]+" ");
	}
    }
    
}
