package wx_redpackage;

import java.math.BigDecimal;
import java.util.Random;

public class Main {
	    public static void main(String[] args) throws Exception {
        BigDecimal left = new BigDecimal("100");
        int    size = 15;
        BigDecimal sum  = new BigDecimal("0");


        BigDecimal[] arr = new BigDecimal[size]; 

        RedPackage redPackage = new RedPackage(left, size);

        for(int i=0;i<size;i++) {
            arr[i] = getMoney(redPackage);
            sum    = sum.add(arr[i]);

            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println(sum);
    
    }

    /**
     * 核心逻辑就是，在最小值和最大值（剩余金额/剩余分数*2）随机一个值
     * 使用场景就是当用户点击拆的按钮时运行一下
     * */
    public static BigDecimal getMoney(RedPackage redPackage) {
        int size = redPackage.getSize();
        BigDecimal left = redPackage.getLeft();

        if (size == 1) {
            return left;
        }

        Random r = new Random();

        double min = 0.01;

        // double max = left/size*2;
        BigDecimal max = left.divide(new BigDecimal(size), 2, BigDecimal.ROUND_DOWN).multiply(BigDecimal.valueOf(2));
        double money = r.nextDouble()*max.doubleValue();

        money = money<=min?min:money;

        money = Math.floor(money*100)/100;

        redPackage.setLeft(left.subtract(new BigDecimal(String.valueOf(money))));

        redPackage.setSize(size-1);

        return new BigDecimal(String.valueOf(money));
    }
   
}


class RedPackage {
    private BigDecimal left;
    private int        size;
    
    public RedPackage() {
    
    }

    public RedPackage(BigDecimal left, int size) {
        this.left = left;
        this.size = size;
    }

    public void setLeft(BigDecimal left) {
        this.left = left;
    }

    public BigDecimal getLeft() {
        return left;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
