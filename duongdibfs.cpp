#include<bits/stdc++.h>
using namespace std;
vector<int> check[1005];
int way[1005];
bool ok[1005];
void bfs(int u,int v)
{
	queue<int> q;
	q.push(u);
	while(q.size()>0)
	{
		int k=q.front();
		q.pop();
		ok[k]=true;
		if(k==v) return ;
		
		for(int i=0;i<check[k].size();i++)
		{
			if(!ok[check[k][i]])
			{
				ok[check[k][i]]=true;
				q.push(check[k][i]);
				way[check[k][i]]=k;
			}
		}
	}
}
void trace(int u,int v)
{
	if(!ok[v])
	{
		cout<<-1<<endl;
		return;
	}
	vector<int> a;
	while(u!=v)
	{
		if(u==0)
		{
			cout<<-1;
			return;
		}
		a.push_back(u);
		u=way[u];
	}
	a.push_back(v);
	reverse(a.begin(),a.end());
	for(int i=0;i<a.size();i++)
	{
		cout<<a[i]<<" ";
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
			check[i].clear();
		}
		memset(way,0,sizeof(way));
		memset(ok,false,sizeof(ok));
		int a,b;
        int s,d;
			cin>>a>>b>>s>>d;
			for(int i=0;i<b;i++)
			{
				int u,v;
				cin>>u>>v;
				check[u].push_back(v);
				//check[v].push_back(u);
			}
		bfs(s,d);
		trace(d,s);
		cout<<endl;
	}
	return 0;
}
