package learn.leetcode;

/**
 * @description:
 * @author: lsl
 * @create: 2020-11-12 09:37
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 * <p>
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 * <p>
 * 你可以返回任何满足上述条件的数组作为答案。
 * <p>
 * 示例：
 * <p>
 * 输入：[4,2,5,7]
 * 输出：[4,5,2,7]
 * 解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 *  1 1 2 3 4 0 5 6 7 8 9
 * <p>
 * 提示：
 * <p>
 * 2 <= A.length <= 20000
 * A.length % 2 == 0
 * 0 <= A[i] <= 1000
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-array-by-parity-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class Solution922 {
    /**
     * 2 ms	39.7 MB
     *
     * @param A
     * @return
     */
    public int[] sortArrayByParityII(int[] A) {
        int i = 0, j = A.length - 1;
        while (true) {
            while (i < A.length - 1 && (A[i] & 1) == 0) {
                i += 2;
            }
            if (i >= A.length - 1) {
                break;
            }
            while ((A[j] & 1) == 1) {
                j -= 2;
            }
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i += 2;
            j -= 2;
        }
        return A;
    }

//    /**
//     * 2 ms	39.9 MB
//     *
//     * @param A
//     * @return
//     */
//    public int[] sortArrayByParityII(int[] A) {
//        int i = 0, j = A.length - 1;
//        while (true) {
//            while (i < A.length - 1 && (A[i] & 1) == 0) {
//                i += 2;
//            }
//            while (j > 0 && (A[j] & 1) == 1) {
//                j -= 2;
//            }
//            if (i < A.length - 1 && j > 0) {
//                int temp = A[i];
//                A[i] = A[j];
//                A[j] = temp;
//                i += 2;
//                j -= 2;
//            } else {
//                break;
//            }
//        }
//        return A;
//    }

/**
 * 3 ms	39.6 MB
 * <p>
 * 3 ms	39.6 MB
 *
 * @param A
 * @return 4 ms	39.6 MB
 * <p>
 * 9s 42.1 MB
 */
//    public int[] sortArrayByParityII(int[] A) {
//        int temp;
//        for (int i = 0, j = A.length - 1; i < A.length - 1 && j > 0; ) {
//            while (i < A.length - 1 && A[i] % 2 == 0) {
//                i += 2;
//            }
//            while (j > 0 && A[j] % 2 == 1) {
//                j -= 2;
//            }
//            if (i < A.length - 1 && j > 0){
//                temp = A[i];
//                A[i] = A[j];
//                A[j] = temp;
//                i += 2;
//                j -= 2;
//            }else {
//                break;
//            }
//        }
//        return A;
//    }

/**
 * 3 ms	39.6 MB
 *
 * @param A
 * @return
 */
//    public int[] sortArrayByParityII(int[] A) {
//        int temp;
//        for (int i = 0, j = A.length - 1; i < A.length - 1 && j > 0; ) {
//            if (A[i] % 2 == 1 && A[j] % 2 == 0) {
//                temp = A[i];
//                A[i] = A[j];
//                A[j] = temp;
//                i += 2;
//                j -= 2;
//                continue;
//            }
//            while (i < A.length - 1 && A[i] % 2 == 0) {
//                i += 2;
//            }
//            while (j > 0 && A[j] % 2 == 1) {
//                j -= 2;
//            }
//        }
//        return A;
//    }
/**
 * 4 ms	39.6 MB
 */
//    public int[] sortArrayByParityII(int[] A) {
//        int temp;
//        for (int i = 0, j = A.length - 1; i < A.length - 1 && j > 0; ) {
//            if (A[i] % 2 == 1 && A[j] % 2 == 0) {
//                temp = A[i];
//                A[i] = A[j];
//                A[j] = temp;
//                i += 2;
//                j -= 2;
//                continue;
//            }
//            if (A[i] % 2 == 0) {
//                i += 2;
//            }
//            if (A[j] % 2 == 1) {
//                j -= 2;
//            }
//        }
//        return A;
//    }


/**
 * 9s 42.1 MB
 */
//    public int[] sortArrayByParityII(int[] A) {
//        List<Integer> evenOdd = new ArrayList();
//        for (int i = 0; i < A.length; i += 2) {
//            if (A[i] % 2 != 0) {
//                evenOdd.add(i);
//            }
//        }
//        int temp;
//        for (int i = 1; i < A.length; i += 2) {
//            if (A[i] % 2 != 1) {
//                temp = A[i];
//                A[i] = A[evenOdd.get(0)];
//                A[evenOdd.remove(0)] = temp;
//            }
//        }
//        return A;
//    }
}
