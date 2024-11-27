//Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
class Solution(object):
    def majorityElement(self, nums):
        l=(len(nums))/3
        hashmap={}
        res=[]
        for n in nums:
            if n in hashmap:
                hashmap[n]+=1
            else:
                hashmap[n]=1
        for key,val in hashmap.items():
            if val>l:
               res.append(key)
        return res
