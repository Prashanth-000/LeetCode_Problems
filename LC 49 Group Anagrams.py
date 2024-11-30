# Given an array of strings strs, group the anagrams together. You can return the answer in any order.
class Solution(object):
    def groupAnagrams(self, strs):
        res=defaultdict(list)
        for s in strs:
            count=[0]*26
            for c in s:
                count[ord(c)-ord('a')]+=1
            res[tuple(count)].append(s)
        return res.values()
# Runtime
# 27 ms
# Beats 37.83%
# Analyze Complexity
# Memory 17.89 MB
# Beats 9.06%
                
        
