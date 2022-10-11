public class Main {
    public static void main(String[] args) {
        int array[] = {-2, 9, 11, 12, 13, 14, 15, 22, 142};
        int key = 15;
        System.out.println("1 task: " + search(array, key));
       // System.out.println("2 task: " + binarysearch(array, key));
    }

    static boolean search(int[] array, int key) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                count++;
                System.out.println("program completed with" + count + " comparisons");
                return true;
            } else
                count++;
        }
        return false;
    }

   /* static boolean binarysearch(int[] array, int key) {
        int count = 0;
        int mid=array.length/2;
        while (array[mid] != key) {
            System.out.println("compared against" + array[mid]);
            if (key > mid) {
                count++;
                mid = (array.length+mid)/2;
                return false;
            }
            else if (key < array[mid]) {
                count++;
                mid = mid/2;
                return false;
            }
        }
        System.out.println("program completed with " + count + " comparisons");
        return true;
    } */
}