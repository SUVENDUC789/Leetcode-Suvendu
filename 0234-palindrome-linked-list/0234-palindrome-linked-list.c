/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool isPalindrome(struct ListNode* head){
    struct ListNode*p= head;
    struct ListNode*q= head;
    int size=0;
    while(p){
        size++;
        p=p->next;
    }
    // printf("Size=%d",size);
    int *a=(int*)calloc(size,sizeof(int));
    int j=0;
    while(q){
      a[j++]=q->val;  
        q=q->next;
    }
    
    for(int i=0;i<size/2;i++){
        if(a[i]!=a[size-1-i]){
            return false;
        }
    }
    return true;

}