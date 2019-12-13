package dataStructures;

/**
 * @author : lixiang
 * @date : 2019-12-12 17:42
 */
public class SparseArr {

    /**
     * 二维数组转为稀疏数组
     *
     * @param chessArr
     * @return
     */
    public static int[][] getSparseArr(int[][] chessArr) {
        int count = 0;
        for (int i = 0; i < chessArr.length; i++) {
            for (int j = 0; j < chessArr[0].length; j++) {
                if (chessArr[i][j] != 0) {
                    count++;
                }
            }
        }
        int[][] sparseArr = new int[count + 1][3];
        sparseArr[0][0] = chessArr.length;
        sparseArr[0][1] = chessArr[0].length;
        sparseArr[0][2] = count;
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr[i][j] != 0) {
                    sum++;
//                    第几行 count+1
                    sparseArr[sum][0] = i;
//                    第几列
                    sparseArr[sum][1] = j;
//                    对应的值
                    sparseArr[sum][2] = chessArr[i][j];
                }
            }
        }
        for (int[] row : sparseArr) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        return sparseArr;
    }

    /**
     * 稀疏数组转二维数组
     *
     * @param sparseArr
     * @return
     */
    public static int[][] getTwoArr(int[][] sparseArr) {
        int[][] twoArr = new int[sparseArr[0][0]][sparseArr[0][1]];
        for (int i = 1; i < sparseArr.length; i++) {
            twoArr[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }
        for (int[] row : twoArr) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
        return twoArr;

    }


    public static void main(String[] args) {
//        创建一个原始数组
//        0表示没有棋子 1表示黑子2表示蓝子
        int[][] chessArr = new int[11][11];
        chessArr[1][2] = 1;
        chessArr[2][3] = 2;
        getSparseArr(chessArr);
//         输出原始二维数组
//        将二维数组转化为稀疏数组
//        遍历二维数组。得到非0 个数；
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr[i][j] != 0) {
                    sum++;
                }
            }
        }
//         创建对应的稀疏数组
        int[][] sparseArr = new int[sum + 1][3];
//        给稀疏数组赋值；
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;
//        遍历二维数组 ，将非0的值存放到稀疏数组中
//        用于记录第几个非零数据；
        int count = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr[i][j] != 0) {
                    count++;
//                    第几行 count+1
                    sparseArr[count][0] = i;
//                    第几列
                    sparseArr[count][1] = j;
//                    对应的值
                    sparseArr[count][2] = chessArr[i][j];
                }
            }
        }
//稀疏数组转为二维数组；
        int[][] sparseArr1 = new int[sparseArr[0][0]][sparseArr[0][1]];
        for (int i = 1; i < sparseArr.length; i++) {
            sparseArr1[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }
        getTwoArr(sparseArr);
    }
}
