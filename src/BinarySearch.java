public class BinarySearch {
    public static void main(String[] args) {
//        int nums[] = {5,7,9,11,13};
        int nums[] = new int[32];
        int target = 900;
        
        int result = binarySearch(nums, target);
        
        if(result != -1){
            System.out.println("Element found at index: " + result);
        }else
            System.out.println("Element not found...");
    }
    
    public static int binarySearch(int[] nums, int target) {

        int steps = 0;
        int left = 0;
        int right = nums.length-1;

        while(left <= right) {
            steps++;
            int mid = (left + right)/2;

            if(nums[mid] == target) {
                System.out.println("Steps taken by Binary: " + steps);
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        System.out.println("Steps taken by Binary: " + steps);
        return -1;
    }
}
