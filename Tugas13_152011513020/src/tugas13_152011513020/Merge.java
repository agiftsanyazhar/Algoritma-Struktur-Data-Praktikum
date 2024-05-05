package tugas13_152011513020;

public class Merge {
    private int[] data;
    
    public void merge(int[] x, int[] l, int[] r) {
        int nL  = l.length;
        int nR  = r.length;
        int i   = 0;
        int j   = 0;
        int k   = 0;
        
        while (i < nL && j < nR) {
            if ( l[i] < r[j] ) {
                x[k] = l[i];
                i++;
            } else {
                x[k] = r[j];
                j++;
            }
            k++;
        }
        while ( i < nL ) {
            x[k] = l[i];
            i++;
            k++;
        }
        while ( j < nR ) {
            x[k] = r[j];
            j++;
            k++;
        }
    }
    
    public void mergeSort (int[] x) {
        int n = x.length;
        if (n < 2){
            return;
        }
        
        int mid = n/2;
        int[] l = new int [mid];
        int[] r = new int [n-mid];
        for (int i = 0; i < mid; i++) {
            l[i] = x[i];
        }
        for (int j = mid; j < n; j++) {
            r[j-mid] = x[j];
        }
        mergeSort(l);
        mergeSort(r);
        merge(x, l, r);
    }
    
    int[] data(){
        return this.data;
    }
}
