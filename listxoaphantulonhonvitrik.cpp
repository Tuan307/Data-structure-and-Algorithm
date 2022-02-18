#include<iostream>
using namespace std;
struct node
{
    int data;
    node *next;
};
node *create(int x)
{
    node *tmp=new node;
    tmp->data=x;
    tmp->next=NULL;
    return tmp;
}
node *add(node*p,int x)
{
    node *tmp=create(x);
    p->next=tmp;
    return tmp;
}
void printList(node *l){
	node *p = l;
	while (p != NULL){
		cout << p->data << " ";
		p = p->next;
	}
}
node *get(node *l,int k)
{
node *p = l;
	for (int i = 0; i < k; i++){
		p = p->next;
	}
	return p;
}
node *deleteat(node *l,int k)
{
    node *p=l;
    node *b=get(l,k);
    while(l->data>b->data)
    {
    	l=l->next;
	}
    while(p->next!=NULL)
    {
        if(p->next->data>b->data)
        {
            node *tmp=p->next;
            p->next=p->next->next;
            delete(tmp);
        }
        else p=p->next;	
    }
    return l;
}
int main(){
	int n, x, k;
	cin >> n;
	cin >> x;
	node *l = create(x);
	node *p = l;
	for (int i = 1; i < n; i++){
		cin >> x;
		p = add(p, x);
	}
	cin >> k;
	l = deleteat(l,k);
	printList(l);
	return 0;
}
