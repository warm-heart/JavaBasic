package sort;

/**
 * @author wangqianlong
 * @create 2019-11-19 18:04
 */

public class BubblingSort {

//    public static void bubbleSort(int[] values) {
//        int temp, i;
//        // 外层循环：n个元素排序，则至多需要n-1趟循环
//        for (i = 0; i < values.length - 1; i++) {
//            // 定义一个布尔类型的变量，标记数组是否已达到有序状态
//            boolean flag = true;
//            /*内层循环：每一趟循环都从数列的前两个元素开始进行比较，比较到无序数组的最后*/
//            for (int j = 0; j < values.length - 1 - i; j++) {
//                // 如果前一个元素大于后一个元素，则交换两元素的值；
//                if (values[j] > values[j + 1]) {
//                    temp = values[j];
//                    values[j] = values[j + 1];
//                    values[j + 1] = temp;
//                    //本趟发生了交换，表明该数组在本趟处于无序状态，需要继续比较；
//                    //即本趟只要发生了一次交换，就false
//                    flag = false;
//                }
//            }
//            //根据标记量的值判断数组是否有序，如果有序，则退出；无序，则继续循环。
//            if (flag) {
//                break;
//            }
//        }
//    }

    public static void bubbleSort(int[] values) {

        for (int i = 0; i < values.length - 1; i++) {

            boolean flag = true;
            for (int j = 0; j < values.length - 1 - i; j++) {
                if (values[j] > values[j + 1]) {
                    swap(j, j + 1, values);
                    flag=false;
                }
            }
            if (flag)
                break;
        }
    }

    public static void swap(int one, int two, int[] values) {
        int temp = values[one];
        values[one] = values[two];
        values[two] = temp;
    }


    public static void main(String[] args) {
        int test[] = new int[]{8, 6, 2, 3, 1, 5, 7, 4,4};
        //int test[] = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        bubbleSort(test);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i]);
        }
    }
}
