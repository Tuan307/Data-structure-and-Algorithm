#include<bits/stdc++.h>
using namespace std;
bool ok[1005];
vector<int> check[1005];
void dfs(int u)
{
	ok[u]=true;
	cout<<u<<' ';
	for(int i=0;i<check[u].size();i++)
	{
		if(!ok[check[u][i]])
		{
			dfs(check[u][i]);
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
			check[i].clear();
			memset(ok,false,sizeof(ok));
			int a,b,d;
			cin>>a>>b>>d;
			for(int i=0;i<b;i++)
			{
				int u,v;
				cin>>u>>v;
				check[u].push_back(v);
				check[v].push_back(u);
			}
		dfs(d);
		cout<<endl;
	}
	return 0;
}
