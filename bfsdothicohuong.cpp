#include<iostream>
#include<string.h>
#include<vector>
#include<queue>
using namespace std;
vector<int> ke[1005];
bool check[1005];
void bfs(int u)
{
	queue<int> q;
	q.push(u);
	while(q.size()>0)
	{
		int tmp=q.front();
		cout<<tmp<<" ";
		q.pop();
		check[tmp]=true;
		for(int i=0;i<ke[tmp].size();i++)
		{
			if(!check[ke[tmp][i]])
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
		for(int i=0;i<1001;i++)
		ke[i].clear();
		memset(check,false,sizeof(check));
		int a,b,c;
		cin>>a>>b>>c;
		for(int i=0;i<b;i++)
		{
			int u,v;
			cin>>u>>v;
			ke[u].push_back(v); 
			ke[v].push_back(u); 
		}
		bfs(c);
		cout<<endl;
	}
	return 0;
}
