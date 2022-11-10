/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head){
    struct ListNode*p=head;
    struct ListNode*q=head;
    int c=0;
    while(p!=NULL){
        c++;
        p=p->next;
    }
    printf("%d",c);
    int i=0;
    while(q){
        if(i==c/2){
            return q;
        }
        i++;
        q=q->next;
    }
    return head;

}