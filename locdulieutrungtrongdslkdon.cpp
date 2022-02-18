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
void remove(node *l)
{
	node *p1=l;
	node *p2,*dup;
	while(p1!=NULL&&p1->next!=NULL)
	{
		p2=p1;
		while(p2->next!=NULL)
		{
			if(p1->data==p2->next->data)
			{
				dup=p2->next;
				p2->next=p2->next->next;
				delete(dup);
			}
			else
			{
				p2=p2->next;
			}
		}
		p1=p1->next;
	}
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
    int n;
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
	remove(l);
	print(l);
	return 0;
}
