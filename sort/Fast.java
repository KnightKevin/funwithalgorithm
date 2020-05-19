package sort;

public class Fast {
    public static void main(String[] args) {

        int[] a = {12,34,54,62,34,56,7,8,9,234,2};

        sort(a);

        for (int i : a) {
            System.out.print(i+" ");
        }

    }

    public static void sort(int[] a) {
        doSort(a, 0, a.length-1);
    }

    private static void doSort(int[] a, int s, int e) {

        if (s >= e) {
            return;
        }

        int tmp = a[s];

        // 首尾指针
        int i = s;
        int j = e;

        while (i<j) {

            while (i<j && a[j]>tmp) {
                j--;
            }

            if (i < j) {
                a[i++] = a[j];
            }
            

            while (i<j && a[i]<=tmp) {
                i++;
            }

            if (i<j) {
                a[j--] = a[i];
            }
        }

        a[i] = tmp;

        doSort(a, s, i-1);
        doSort(a, i+1, e);
        
    }


    
}