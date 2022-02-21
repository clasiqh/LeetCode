class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        x, count = nums[0], 0
        for v in nums:
            if v == x:
                count += 1
            else:
                count -= 1
                if count == 0:
                    x = v
                    count = 1
        return x
