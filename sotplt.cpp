#include<iostream>
#include<vector>
#include<string.h>
#include<stack>
using namespace std;
vector<int> check[1005];
bool ok[1005];
int a;
int b;
int g[1005][1005];
void dfs(int u)
{
	ok[u]=true;
	for(int i=1;i<=a;i++)
	{
		if(!ok[i])
		{
			dfs(i);
		}
	}
}
int main()
{
	
		for(int i=0;i<1001;i++)
			check[i].clear();
			for(int i=1;i<=a;i++)
			{
			    for(int j=1;j<=a;j++)
			    {
			        g[i][j]=0;
			    }
			}
			memset(ok,false,sizeof(ok));
			cin>>a>>b;
			for(int i=0;i<b;i++)
			{
				int u,v;
				cin>>u>>v;
				check[u].push_back(v);
				check[v].push_back(u);
				g[u][v]=1;
				g[v][u]=1;
			}
			int count=0;
			for(int i=1;i<=a;i++)
			{
				if(!ok[i])
				{
					count++;
					dfs(i);
				}
			}
		     cout<<count+1<<endl;
	return 0;
}
