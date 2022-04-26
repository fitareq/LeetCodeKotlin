package `1920 Build Array from Permutation`

class Solution {
  /*  fun buildArray(nums: IntArray): IntArray {
        val res  = MutableList(nums.size){0}
        for(i in nums.indices)
        {
            res[i] = nums[nums[i]]
        }
        return res.toIntArray();
    }*/
    fun buildArray(nums: IntArray): IntArray {
        val res  = IntArray(nums.size)
        for(i in nums.indices)
        {
            res[i] = nums[nums[i]]
        }
        return res;
    }
}