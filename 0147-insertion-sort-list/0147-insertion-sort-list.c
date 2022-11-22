int SizeofList(struct ListNode *p)
{
    int c = 0;
    while (p)
    {
        c++;
        p = p->next;
    }
    return c;
}
int comp(const void *a, const void *b)
{
    const int *pa = a;
    const int *pb = b;
    return *pa - *pb;
}
struct ListNode *insertionSortList(struct ListNode *head)
{
    struct ListNode *p = head;
    struct ListNode *q = head;
    struct ListNode *f = head;
    int n = SizeofList(p);
    // printf("Size of list is : %d\n", n);
    int *a = (int *)calloc(n, sizeof(int));
    int k = 0;
    while (q != NULL)
    {
        a[k++] = q->val;
        q = q->next;
    }
    qsort(a, n, sizeof(int), comp);
    k = 0;
    while (f)
    {
        f->val = a[k++];
        f = f->next;
    }
    // for(int i=0;i<n;i++)
    // {
    //     printf("%d\n",a[i]);
    // }
    return head;
}