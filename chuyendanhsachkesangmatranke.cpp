	#include<iostream>
	#include<vector>
	
	using namespace std;
		vector<int> ke[1001];
	int main()
	{
		int n;
			cin>>n;
			for(int i=1;i<=n;i++)
			{
				int u,v;
				cin>>u>>v;
				ke[u].push_back(v);
				ke[v].push_back(u);
				g[u][v]=g[v][u]=1;
			}
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					cout<<g[i][j]<<" ";
				}
				cout<<endl;
			}	
		return 0;
	}

