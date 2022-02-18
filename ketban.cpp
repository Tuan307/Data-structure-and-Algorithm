#include<iostream>
#include<vector>
#include<string.h>
#include<queue>
using namespace std;
vector<int> ke[1005];
bool check[1005];
int bfs(int u)
{
	int res=0;
	queue<int> q;
	q.push(u);
	int count=0;
	while(q.size()>0)
	{
		int tmp=q.front();
		q.pop();
		check[tmp]=true;
		count++;
		for(int i=0;i<ke[tmp].size();i++)
		{
			if(!check[ke[tmp][i]])
			{
				check[ke[tmp][i]]=true;
				q.push(ke[tmp][i]);
			}
		}
	}
	res=max(count,res);
	return res;
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		for(int i=0;i<1001;i++)
		ke[i].clear();
		memset(check,false,sizeof(check));
		int n,m;
		cin>>n>>m;
		for(int i=0;i<m;i++)
		{
			int u,v;
			cin>>u>>v;
			ke[u].push_back(v);
			ke[v].push_back(u);
		}
		int k=0;
		for(int i=1;i<=n;i++)
		{
			int c=bfs(i);
			k=max(k,c);
		}
		cout<<k;
	    cout<<endl;	
    } 
	return 0;
}
