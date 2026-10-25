class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        ans=[]
        for i in range(0,len(nums)):
            if(target-nums[i] in nums and nums.index(target-nums[i])!=i):
                ans.append(i)
                ans.append(nums.index(target-nums[i]))
                break
        return ans