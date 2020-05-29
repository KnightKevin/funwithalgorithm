package sort;

public class Shell {
    public static void sort(int[] a) {
        shell(a);
    }

    public static void shell(int[] a) {
        int offset = a.length>>1;

        while (offset>=1) {

            for (int i= offset;i<a.length;i++) {
                int j = i;
                while (j-offset>=0) {
                    if (a[j]<a[j-offset]) {
                        a[j]        = a[j]^a[j-offset];
                        a[j-offset] = a[j]^a[j-offset];
                        a[j]        = a[j]^a[j-offset];
                    }
                    j-=offset;
                }
            }

            offset--;
        }
    }
}