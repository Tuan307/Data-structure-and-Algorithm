#include<iostream>
using namespace std;
struct node
{
	int data;
    node *left;
    node *right;
    	node(int x){
		data = x;
		left = NULL;
		right = NULL;
	}
};
node *insert(node **t,int u,int v,char k)
{
	if((*t)!=NULL&&(*t)->data==u)
	{
		if(k=='L') (*t)->left=new node(v);
		else (*t)->right=new node(v);
	}
	else
	{
		if((*t)->right != NULL) insert(&(*t)->right,u,v,k);
		if((*t)->left != NULL) insert(&(*t)->left,u,v,k);
	}
}
bool check(node *t,int level,int &leaf)
{
	if(t==NULL)
	{
		return true;
	}
	 if (t->left == NULL &&t->right == NULL)
    {
        if (leaf == 0)
        {
            leaf = level;
            return true;
        }
        return (level == leaf);
    }
    return check(t->left,level+1,leaf)&&check(t->right,level+1,leaf);
}
bool checkans(node *t)
{
	int level=0,leaf=0;
	return check(t,level,leaf);
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n,u,v;
		char x;
		cin>>n>>u>>v>>x;
		node *t=new node(u);
		insert(&t,u,v,x);
		for(int i=1;i<n;i++)
		{
			cin>>u>>v>>x;
			insert(&t,u,v,x);
		}
		if(checkans(t))
		{
			cout<<"1";
		}
		else cout<<"0";
		cout<<endl;
	}
	return 0;
}
