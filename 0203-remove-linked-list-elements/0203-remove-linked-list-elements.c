/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int sizeisList(struct ListNode*p, int val){
    int c=0;
    while(p){
        if(p->val!=val)
            c++;
        p=p->next;
    }
    return c;
}
struct ListNode*InsertAtLast(struct ListNode*head, int newData)
{
    struct ListNode*ptr = (struct ListNode*)malloc(sizeof(struct ListNode));
    ptr->val = newData;
    ptr->next = NULL;

    struct ListNode*p = head;
    while (p->next != NULL)
    {
        p = p->next;
    }
    p->next = ptr;
    return head;
}
struct ListNode* removeElements(struct ListNode* head, int val){
    if(head==NULL)
        return head;
    int n=sizeisList(head,val);
    if(n==0){
        head=NULL;
        return head;
    }
    int *a=(int *)calloc(n,sizeof(int));
    
    struct ListNode* p=head;
    int k=0;
    while(p){
        if(p->val!=val)
            a[k++]=p->val;
        p=p->next;
    }
    
    struct ListNode*ptr = (struct ListNode*)malloc(sizeof(struct ListNode));
    ptr->val = a[0];
    ptr->next = NULL;
    
    for(int i=1;i<n;i++){
        
        ptr=InsertAtLast(ptr,a[i]);
    }
    return ptr;

}