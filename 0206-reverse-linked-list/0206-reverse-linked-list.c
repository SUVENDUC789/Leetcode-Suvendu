/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* reverseList(struct ListNode* head){
    struct ListNode* p=head;
    struct ListNode*q=head;
    struct ListNode*s=head;
    int i=0;
    while(p){
        i++;
        p=p->next;
    }
    int arsize=i;
    int *a=(int*)calloc(i,sizeof(int));
    int k=0;
    while(q){
        a[k]=q->val;
        // printf("%d %d\n",k,a[k]);
        k++;
        q=q->next;
    }
    
    while(s){
        s->val=a[--arsize];
        s=s->next;
    }
    // printf("%d\n",i);
    free(a);
    return head;
}