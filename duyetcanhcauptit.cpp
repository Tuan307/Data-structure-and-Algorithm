#include<iostream>
#include<stack>
#include<vector>
#include<string.h>
using namespace std;
int n;
int g[1000][1000];
bool check[1000];
vector<int> ke[1000];
int a,b;
void dfs(int u)
{
    check[u]=true;
    
        for(int i=1;i<=a;i++)
        {
            if(check[i]==false&&g[u][i]==1)
            {
                dfs(i);
            }
        }
}
void rein()
{
    for(int i=1;i<=a;i++)
    {
        check[i]=false;
    }
}
void ktra()
{
    for(int u=1;u<=a;u++)
    {
    	for(int v=u+1;v<=a;v++)
    	{
    		if(g[u][v]==1)
    		{
    			g[u][v]=0;
    			g[v][u]=0;
    			dfs(1);
    			for(int i=1;i<=a;i++)
    			{
    				if(check[i]==false)
    				{
    					cout<<u<<" "<<v<<" ";
    					break;
					}
				}
				g[u][v]=1;
				g[v][u]=1;
				rein();
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
	cin>>a>>b;
    for(int i=1;i<=b;i++)
    {
    	int u,v;
    	cin>>u>>v;
    	ke[u].push_back(v);
		ke[v].push_back(u);
		g[u][v]=g[v][u]=1; 
	}
    ktra();
}
    return 0;
}
