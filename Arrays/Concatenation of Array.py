class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        x = len(nums)
        for i in range(0,x):
            nums.append(nums[i])
        return nums