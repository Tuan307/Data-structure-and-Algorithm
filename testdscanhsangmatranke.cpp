#include<iostream>
#include<vector>
#include<string.h>
#include<queue>
using namespace std;
vector<int> check[105];
int way[105]={0};
int ok[105]={0};
int a,b;
int s,d;
int g[105][105];
void bfs()
{
	queue<int> q;
	q.push(s);
	ok[s]=1;
	while(q.size()>0)
	{
		int k=q.front();
		q.pop();
		for(int i=1;i<=a;i++)
		{
			if(g[k][i]==1&&ok[i]==0)
			{
				ok[i]=1;
				q.push(i);
				way[i]=k;
			}
		}
	}
}
void rote()
{
	int res[105];
	int m=0;
    int i=d;
    res[m++]=i;
    while(way[i]!=s)
    {
    	res[m++]=way[i];
        //cout<<way[i]<<" ";
        i=way[i];
    }
    res[m++]=s;
    //cout<<s<<endl;
    for(int j=m-1;j>=0;j--)
    {
    	cout<<res[j]<<" ";
	}
	cout<<endl;
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		for(int i=0;i<106;i++)
		{
			check[i].clear();
		}
		memset(way,0,sizeof(way));
		memset(ok,0,sizeof(ok));
			for(int i=1;i<=105;i++)
			{
			    for(int j=1;j<=105;j++)
			    {
			        g[i][j]=0;
			    }
			}
			cin>>a>>b>>s>>d;
			for(int i=0;i<b;i++)
			{
				int u,v;
				cin>>u>>v;
				check[u].push_back(v);
				check[v].push_back(u);
				g[u][v]=1;
				g[v][u]=1;
			}
			bfs();
		if(way[d]==0) cout<<-1<<endl;
		else
		{
			rote();
		}
	}
	return 0;
}
