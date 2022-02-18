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
node *adde(node *p,int x)
{
	node *tmp=create(x);
	p->next=tmp;
	return tmp;
}
node *remove(node *l,int x)
{
	node *tmp=l;
	while(l->data==x)
	{
		l=l->next;
	}
	while(tmp->next!=NULL)
	{
		if (tmp->next->data == x)
        {
        	node *dup=tmp->next;
            tmp->next = tmp->next->next;
            delete(dup);
        }
        else
        {
            tmp = tmp->next;
        }
	}
	return l;
}
void print(node *l)
{
	node *p=l;
	while(p!=NULL)
	{
		cout<<p->data<<" ";
		p=p->next;
	}
}
int main()
{
    int n,k;
	cin>>n;
	int x;
	cin>>x;
	node *l=create(x);
	node *p=l;
	for(int i=1;i<n;i++)
	{
		cin>>x;
		p=adde(p,x);
	}
	cin>>k;
	l=remove(l,k);
	print(l);
	return 0;
}
