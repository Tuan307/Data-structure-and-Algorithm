#include<iostream>
#include<vector>
#include<string.h>
#include<queue>
using namespace std;
bool check[1005];
vector<int> ke[1005];
void bfs(int u)
{
	queue<int> q;
	q.push(u);
	cout<<u<<" ";
	check[u]=true;
	while(!q.empty())
	{
		int tmp=q.front();
		q.pop();
		//check[tmp]=true;
	   // cout<<tmp<<" ";
		for(int i=0;i<ke[tmp].size();i++)
		{
			if(check[ke[tmp][i]]==false)
			{
				q.push(ke[tmp][i]);
				cout<<ke[tmp][i]<<" ";
				check[ke[tmp][i]]=true;
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
		for(int i=0;i<1001;i++)
		{
			ke[i].clear();
		}
		int n,s,k;
		cin>>n>>s>>k;
		memset(check,false,sizeof(check));
		for(int i=0;i<s;i++)
		{
			int u,v;
			cin>>u>>v;
			ke[u].push_back(v);
			ke[v].push_back(u);
		}
		bfs(k);
		cout<<endl;
	}	
	return 0;
}
