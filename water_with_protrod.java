public class water_with_protrod {
    public static int[] water_protroud(int arr[]) {
        int left = 0, right = arr.length - 1;
        int max = 0;
        int height1 = 0, height2 = 0; // to store heights of max water

        while (left < right) {
            int height = Math.min(arr[left], arr[right]);
            int width = right - left;
            int area = height * width;

            if (area > max) {
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
        System.out.println("The container size will be " +max+ " units");
        return new int[]{height1, height2};
        
    }

    public static void main(String args[]) {
        int arr[] = {1, 8, 6, 2, 5, 4, 9, 3, 7};
        int result[] = water_protroud(arr);
        System.out.println("The container which can hold maximum water wil be " + result[0] + " and " + result[1]);
        
    }
}
