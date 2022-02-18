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
		for(int i=0;i<1001;i++)
		{
			ke[i].clear();
		}
		memset(check,false,sizeof(check));
		int n,s;
		cin>>n>>s;
		for(int i=0;i<s;i++)
		{
			int u,v;
			cin>>u>>v;
			ke[u].push_back(v);
			//ke[v].push_back(u);
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
		if(res==1) cout<<"YES";
		else cout<<"NO";
		cout<<endl;
	}	
	return 0;
}
