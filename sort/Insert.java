package sort;

public class Insert {

    public static void main(String[] args) {

        int[] a = {12,34,54,62,34,56,7,8,9,234,2};

        sort(a);

        for (int i : a) {
            System.out.print(i+" ");
        }

    }

    public static void sort(int[] a) {
        for (int i = 1;i<a.length;i++) {
            int j = i;
            while (j-1>=0) {
                if (a[j]<a[j-1]) {
                    a[j]=a[j]^a[j-1];
                    a[j-1]=a[j]^a[j-1];
                    a[j]=a[j]^a[j-1];
                }
                j--;
            }
        }
    }
    
}