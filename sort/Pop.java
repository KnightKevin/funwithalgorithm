package sort;

public class Pop {
    public static void main(String[] args) {

        int[] a = {12,34,54,62,34,56,7,8,9,234,2};

        sort(a);

        for (int i : a) {
            System.out.print(i+" ");
        }

    }

    public static void sort(int[] a) {
        for (int i=0;i<a.length-1;i++) {
            for (int j = 0;j<a.length-i-1;j++) {
                if (a[j]>a[j+1]) {
                    a[j]   = a[j]^a[j+1];
                    a[j+1] = a[j]^a[j+1];
                    a[j]   = a[j]^a[j+1];
                }

            }
        }
    }
}