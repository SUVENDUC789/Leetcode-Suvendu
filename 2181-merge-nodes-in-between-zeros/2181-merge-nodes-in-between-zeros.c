/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* DeleteAtfastNode (struct ListNode*head){
    
    struct ListNode*p=head;
    head=head->next;
    free(p);
    return head;
    
}

struct ListNode* DeleteAtLastNode (struct ListNode*head){
    
    struct ListNode*p = head;
    struct ListNode*q = p->next;
    while (q->next != NULL)
    {
        p = p->next;
        q = q->next;
    }
    p->next = NULL;
    free(q);
    return head;
    
}


struct ListNode* mergeNodes(struct ListNode* head){
    struct ListNode*p=head;
    struct ListNode*q=head;
    struct ListNode*s=head;
    int size=0;
    while(p!=NULL){
        size++;
        p=p->next;
    }
    int *a=(int*)calloc(size,sizeof(int));
    int k=0;
    while(q!=NULL){
        a[k]=q->val;
        k++;
        q=q->next;
    }
    
    int ln=0,sum=0;
    for(int i=0;i<size;i++){
        if(a[i]==0){
            s->val=sum;
            sum=0;
            ln=1;
            s=s->next;
        }else if(a[i]!=0){
            ln=0;
        }
        
        if(ln==0){
            sum+=a[i];
        }
       
    }
    
    s->next=NULL;
    free(a);
    head=DeleteAtfastNode(head);
    head=DeleteAtLastNode(head);
       
    
return head;
}