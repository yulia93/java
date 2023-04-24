package HomeTasks3;

import java.util.ArrayList;
import java.util.List;

public class Task4sortMerge {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Task1.createListRandomInt(20, 0, 30));
        System.out.println(nums);
        merge_sort(nums);
        System.out.println(nums);
    }
    static void merge_sort(List<Integer> nums) {
        if (nums.size() > 1) {
            int mid = nums.size() / 2;
            List<Integer> left = new ArrayList<>(nums.subList(0, mid));
            List<Integer> right = new ArrayList<>(nums.subList(mid, nums.size()));
            merge_sort(left);
            merge_sort(right);
            int i = 0, j = 0, k = 0;
            while ((i < left.size()) && (j < right.size())){
                if (left.get(i) < right.get(j)){
                    nums.set(k, left.get(i));
                    i ++;
                }
                else {
                    nums.set(k, right.get(j));
                    j++;
                }
                k++;
            }
            while (i < left.size()){
                nums.set(k, left.get(i));
                i++;
                k++;
            }
            while (j < right.size()){
                nums.set(k, right.get(j));
                j++;
                k++;
            }
        }
    }
}
