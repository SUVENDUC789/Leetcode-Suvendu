/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

int comp(const void *elem1, const void *elem2)
{
    int f = *((int *)elem1);
    int s = *((int *)elem2);
    // printf("f=%d|s=%d\n", f, s);
    if (f > s)
        return 1;
    if (f < s)
        return -1;
    return 0;
}
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2){
    if(list1==NULL || list2==NULL){
        if(list1==NULL)
        return list2;
        if(list2==NULL)
        return list1;
        
    }
    struct ListNode*q=list1;
    struct ListNode*p=list1;
    struct ListNode*s=list1;
    struct ListNode*suv=list1;
    while(q->next!=NULL){
        q=q->next;
    }
    q->next=list2;
    int size=0;
    while(p){
        size++;
        p=p->next;
    }
    
    int i=0;
    int *x=(int*)calloc(size,sizeof(int));
    while(s){
        x[i++]=s->val;
        s=s->next;
    }
    
    qsort(x, size, sizeof(int), comp);
    int j=0;
    while(suv){
        suv->val=x[j++];
        suv=suv->next;
    }
    
    // for (int i = 0; i < size; i++)
    //     printf("%d ", x[i]);
    return list1;
}