# Given two strings s and t, return true if t is an anagram of s, and false otherwise.
class Solution(object):
    def isAnagram(self, s, t):
        hashs={}
        hasht={}
        for i in s:
            if i in hashs:
                hashs[i]+=1
            else:
                hashs[i]=1
        for j in t:
            if j in hasht:
                hasht[j]+=1
            else:
                hasht[j]=1
        if hashs==hasht:
            return True
        else:
            return False
        
# Runtime
# 5 ms
# Beats
# 94.33%
# Analyze Complexity
# Memory
# 17.22 MB
# Beats
# 27.46%
