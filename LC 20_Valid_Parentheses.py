/* LeetCode 20. Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
*/

def isValid(s):
    stack=[]
    hashmap={")":"(","}":"{","]":"["}
    for p in s:
        if p in hashmap.values():
            stack.append(p)
        elif stack and hashmap[p]==stack[-1]:
            stack.pop()
        else:
            return False
    return stack==[]



if(isValid(input("ENter a string of paranthesis(only (),{},[] are allowd) :\n"))):
    print("True")
else:
    print("False")
