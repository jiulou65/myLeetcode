package com.zx.leetcode201_300;

/**
 * 给你 二维 平面上两个 由直线构成的 矩形，请你计算并返回两个矩形覆盖的总面积。
 *
 * 每个矩形由其 左下 顶点和 右上 顶点坐标表示：
 *
 * 第一个矩形由其左下顶点 (ax1, ay1) 和右上顶点 (ax2, ay2) 定义。
 * 第二个矩形由其左下顶点 (bx1, by1) 和右上顶点 (bx2, by2) 定义。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rectangle-area
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class l223 {
    // -3      -2
    //0    -2
    //3    2
    //4    2
    //0    1
    //-1    1
    //9    3
    //2    3
    public static void main(String[] args) {
        int i = new l223().computeArea(-2, -2, 2, 2, 1, 1, 3, 3);
        System.out.println(i);
    }
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area = 0;
        area += getArea(ax1,ay1,ax2,ay2);
        area += getArea(bx1,by1,bx2,by2);
        int overlapWidth = Math.min(ax2,bx2)-Math.max(ax1,bx1);
        int overlapHeight = Math.min(ay2,by2)-Math.max(ay1,by1);
        area -= Math.max(overlapWidth,0) * Math.max(overlapHeight,0);
        return area;
    }

    // 根据左下点和右上点求矩形面积
    private int getArea(int x1, int y1, int x2, int y2){
        int area = 0;
        // 矩形面加=宽*高
        area = (x2-x1)*(y2-y1);
        return area;
    }
}
