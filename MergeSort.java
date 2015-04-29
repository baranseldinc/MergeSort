package mergesort;

/**
 *
 * @author AnCKa
 */
public class MergeSort {
    void mergesort(int a[]) {
        mergesort(a,0,a.length-1);
    }
    void mergesort(int a[], int low, int high)  { 
       if(low == high)  {
           System.out.println("\t -> A recursive progress has occurred...");
            return; 
       }
       int length = high-low+1; 
       int pivot = (low+high) / 2; 
        System.out.print("...Recursive calling for this [" + a[low]);
       for(int indis = low+1;indis <=pivot;indis++) {
           System.out.print("," + a[indis]);
       } System.out.println("] sub-array");
       mergesort(a, low, pivot); 
       System.out.print("...Recursive calling for this [" + a[pivot+1]);
       for(int indis = pivot+2;indis <=high;indis++) {
           System.out.print("," + a[indis]);
       } System.out.println("] sub-array");
       mergesort(a, pivot+1, high); 
       int working[] = new int[length]; 
       for(int i = 0; i < length; i++)  
           working[i] = a[low+i]; 
       int m1 = 0;  
       int m2 = pivot-low+1; 
       for(int i = 0; i < length; i++) { 
         if(m2 <= high-low)  
             if(m1 <= pivot-low)  
                 if(working[m1] > working[m2])  
                     a[i+low] = working[m2++];   
                 else  
                     a[i+low] = working[m1++]; 
             else  
                 a[i+low] = working[m2++]; 
         else  
             a[i+low] = working[m1++]; 
       } 
     } 
    void printArray(int array[]) {
        for(int i : array) {
            System.out.print(i + " - ");
        }System.out.println("");
    }
    public static void main(String[] args) {
        int dizi[] = {4,2,3,6,8,7,1,5};
        MergeSort sorter = new MergeSort();
        sorter.printArray(dizi);
        sorter.mergesort(dizi);
        sorter.printArray(dizi);
        
    }
    
}
