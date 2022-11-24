/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int sizelist(struct ListNode* head){
    int c=0;
    while(head){
        c++;
        head=head->next;
    }
    return c;
    
}
struct ListNode* deleteDuplicates(struct ListNode* head){
    if(head==NULL)return head;
    struct ListNode*p=head;
    struct ListNode*q=head;
    int n=sizelist(head);
    int *a=(int*)calloc(n,sizeof(int));
    int k=0;
    while(p){
        a[k++]=p->val;
        p=p->next;
        
    }
    
    for(int i=0;i<n-1;i++){
        if(a[i]!=a[i+1]){
            q->val=a[i];
            q=q->next;
            // printf("%d\n",a[i]);
        }
    }
    q->val=a[n-1];
    q->next=NULL;
    return head;

}