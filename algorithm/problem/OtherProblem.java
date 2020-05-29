package algorithm.problem;

public class OtherProblem {

    /**
     * 波菲那切, 递归当然是没问题的啦，但是递归容易栈内存溢出，所以用迭代
     * @param n
     * @return
     */
    public static int fibonacci(int n) {


        int a0 = 1;
        int a1 = 1;

        if (n<=2) {
            return 1;
        }

        int sum = 0;
        for (int i=1;i<n-1;i++) {
            sum = a0+a1;
            a0 = a1;
            a1 = sum;
        }


        return sum;

    }

    public static void main(String[] args) {
        String s = "cbbd";

        System.out.println(fibonacci(6));
    }
}