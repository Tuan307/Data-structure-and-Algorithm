#include<iostream>
#include<vector>
#include<string.h>
#include<queue>
using namespace std;
vector<int> ke[1005];
bool ok[1005];
bool check[1005];
void bfs(int u,int v)
{
	queue<int> q;
	q.push(u);
	while(q.size()>0)
	{
		int tmp=q.front();
		q.pop();
		check[tmp]=true;
		if(tmp==v) 
		{
		cout<<"YES";
		return ;
	    }
		for(int i=0;i<ke[tmp].size();i++)
		{
			if(!check[ke[tmp][i]])
			{
				check[ke[tmp][i]]=true;
				q.push(ke[tmp][i]);
			}
		}
	}
	cout<<"NO";
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		for(int i=0;i<1001;i++)
		ke[i].clear();
		int n,m;
		cin>>n>>m;
		for(int i=0;i<m;i++)
		{
			int u,v;
			cin>>u>>v;
			ke[u].push_back(v);
			ke[v].push_back(u);
		}
		int k;
		cin>>k;
		while(k--)
		{
			memset(check,false,sizeof(check));
			int x,y;
			cin>>x>>y;
			bfs(x,y);
			cout<<endl;
		}
	}
	return 0;
}
