# Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
class Solution(object):
    def rotate(self, nums, k):
        l=len(nums)
        ans=nums[:]
        for i in range(0,l):
            nums[(i+k)%l]=ans[i]          

# Runtime
# 7
# ms
# Beats
# 50.87%
# Analyze Complexity
# Memory
# 25.43
# MB
# Beats
# 6.58%
