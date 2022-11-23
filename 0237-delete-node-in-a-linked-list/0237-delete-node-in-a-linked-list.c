/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
void deleteNode(struct ListNode* node) {
    struct ListNode*p=node,*q=NULL;
    while(p->next!=NULL)
    {
        q=p;
        p->val=(p->next)->val;
        p=p->next;
    }
    q->next=NULL;
    free(p); 
}