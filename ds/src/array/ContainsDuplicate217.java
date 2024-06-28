package array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {

    private boolean containsDuplicate(int[] nums){
        Set<Integer> dataMap = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!dataMap.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
