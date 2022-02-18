	#include<iostream>
	#include<vector>
	#include<string.h>
	using namespace std;
	bool check[1005];
	vector<int> ke[1005];
	void dfs(int u)
	{
			check[u]=true;
			cout<<u<<" ";
			for(int i=0;i<ke[u].size();i++)
			{
				if(!check[ke[u][i]])
				{
					
					dfs(ke[u][i]);
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
				//ke[v].push_back(u);
			}
			dfs(k);
			cout<<endl;
		}	
		return 0;
	}

