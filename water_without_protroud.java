public class water_without_protroud {

    public static int[] water_without(int arr[]) {
        int left = 0, right = arr.length - 1;
        int max = 0, height1 = 0, height2 = 0;

        while (left < right) {
            int height = Math.min(arr[left], arr[right]);
            int width = right - left;
            int area = height * width;

            boolean isValid = true;
            for (int k = left + 1; k < right; k++) {
                if (arr[k] > height) {
                    isValid = false;
                    break;
                }
            }

            if (isValid && area > max) {
                max = area;
                height1 = arr[left];
                height2 = arr[right];
            }

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{height1, height2, max};
    }

    public static void main(String args[]) {
        int arr[] = {1, 8, 6, 2, 5, 4, 9, 3, 7};
        int result[] = water_without(arr);
        System.out.println("The container which can hold maximum water without protruding is formed by heights "
                + result[0] + " and " + result[1] + " with area = " + result[2]);
    }
}
