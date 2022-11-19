public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 10;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }
    //create a function
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            //find middle values
            int mid = start + (end - start)/2;
            //target less than mid value check left side else right side
            if(target < arr[mid]){
                end = mid -1;

            }
            else if(target > arr[mid]){
                start = mid +1;

            }
            //if target == mid //ans
            else {
                return mid;
            }

        }
        return -1;
    }
}