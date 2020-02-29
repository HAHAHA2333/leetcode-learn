package sample.topic02;

public class Soultion02 {
    /*
    * 汉明距离定义：
    * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
    * 给出两个整数 x 和 y，计算它们之间的汉明距离。
    *
    * 异或运算符：^
    * 计算 x 和 y 之间的汉明距离，可以先计算 x XOR y，然后统计结果中等于 1 的位数。
    * 5的二进制位是0000 0101 ，9的二进制位是0000 1001，也就是0101 ^ 1001,结果为1100 , 00001100的十进制位是12
    * */

    public int hammingDistance(int x, int y) {
        int xor = x ^ y, distance = 0;
        while (xor != 0){
            distance += 1;
            //如果对应的二进制位同时为 1，那么计算结果才为 1，否则为 0。因此，任何数与 0 进行按位与运算，其结果都为 0。
            xor = xor & (xor - 1);
        }
        return distance;
    }

    public static void main(String[] args) {
        System.out.println(new Soultion02().hammingDistance(9,12));
    }
}
