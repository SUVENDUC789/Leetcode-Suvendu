/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

int SizeofList(struct ListNode* head){
    int c=0;
    struct ListNode*p=head;
    while(p!=NULL){
        c++;
        p=p->next;
    }
    return c;
}
void initializedArray(struct ListNode*head,int *a,int n){
    for(int i=0;i<n;i++){
        a[i]=head->val;
        head=head->next;
    }
}
int getDecimalValue(struct ListNode* head){
    
    int size=SizeofList(head);
    int *a=(int *)calloc(size,sizeof(int));
    initializedArray(head,a,size);
    int desc=0,j=0;
    for(int i=size-1;i>=0;i--){
        desc+=a[i] * pow(2, j);
        j++;
    }
    return desc;

}