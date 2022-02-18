#include<iostream>
#include<queue>
#include<vector>
#include<string.h>
using namespace std;
bool check[1005];
vector<int> ke[1005];
void bfs(int u)
{
	queue<int> q;
	q.push(u);
	while(!q.empty())
	{
		int tmp=q.front();
		q.pop();
		check[tmp]=true;
		for(int i=0;i<ke[tmp].size();i++)
		{
			if(check[ke[tmp][i]]==false)
			{
				check[ke[tmp][i]]=true;
				q.push(ke[tmp][i]);
			}
		}
	}
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n,v;
		cin>>n>>v;
		for(int i=0;i<1001;i++)
		{
			ke[i].clear();
		}
		memset(check,false,sizeof(check));
		for(int i=0;i<v;i++)
		{
			int a,b;
			cin>>a>>b;
			ke[a].push_back(b);
			ke[b].push_back(a);
		}
		int res=0;
		for(int i=1;i<=n;i++)
		{
			if(!check[i])
			{
				res++;
				bfs(i);
			}
		}
		cout<<res<<endl;
	}
	return 0;
}
