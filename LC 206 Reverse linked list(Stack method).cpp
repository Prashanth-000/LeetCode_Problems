/*
Given the head of a singly linked list, reverse the list, and return the reversed list.
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
*/
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode*cur;
        vector<int> data;
        for(cur=head;cur!=NULL;cur=cur->next){
            data.push_back(cur->val);
        }
        for(cur=head;cur!=NULL;cur=cur->next){
            cur->val=data.back();
            data.pop_back();
        }
        return head;
    }
};

/*
Runtime
0
ms
Beats
100.00%
Analyze Complexity
Memory
13.05
MB
Beats
37.69%
*/
