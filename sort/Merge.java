package sort;

public class Merge {
    public static void main(String[] args) {

        int[] a = {12,34,54,62,34,56,7,8,9,234,2};

        sort(a);

        for (int i : a) {
            System.out.print(i+" ");
        }

    }

    public static void sort(int[] a) {

        merge(a, 0, a.length-1);

    }

    private static void merge(int[] a, int s, int e) {
        if (s == e) {
            return;
        }

        int mid = (e+s)>>1;
    
        merge(a, s, mid);
        merge(a, mid+1, e);


        int k = 0;
        int i = s;
        int j = mid+1;

        int len = e-s+1;
        int[] tmp = new int[len];


        while (i<=mid&&j<=e) {
            tmp[k++] = a[i]<a[j]?a[i++]:a[j++];
        }

        while (i<=mid) {
            tmp[k++] = a[i++];
        }

        while (j<=e) {
            tmp[k++] = a[j++];
        }

        for (k=0;k<len;k++) {
            a[s+k] = tmp[k];
        }
    }
}