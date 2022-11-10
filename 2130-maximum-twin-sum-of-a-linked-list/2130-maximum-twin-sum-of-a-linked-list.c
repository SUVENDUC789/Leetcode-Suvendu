/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int pairSum(struct ListNode* head){
    struct ListNode*p=head;
    struct ListNode*q=head;
    
    int size=0;
    while(p){
        size++;
        p=p->next;
    }
    
    int *a=(int*)calloc(size,sizeof(int));
    
    int j=0;
    while(q){
        a[j++]=q->val;
        q=q->next;
    }
    int *max=(int*)calloc(size/2,sizeof(int));
    for(int i=0;i<size/2;i++){
        max[i]=a[i]+a[size-1-i];
    }
    
    int m=max[0];
    for(int i=0;i<size/2;i++){
        if(m<max[i]){
            m=max[i];
        }
    }
    
    return m;
}