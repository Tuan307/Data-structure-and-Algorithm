#include<iostream>
#include<stack>
#include<vector>
using namespace std;
int n;
int a[1000][1000];
bool check[1000];
void in()
{
    cin>>n;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            cin>>a[i][j];
        }
        check[i]=false;
    }
}
void dfs(int u)
{
    check[u]=true;
    
        for(int i=1;i<=n;i++)
        {
            if(check[i]==false&&a[u][i]==1)
            {
                dfs(i);
            }
        }
}
void rein()
{
    for(int i=1;i<=n;i++)
    {
        check[i]=false;
    }
}
void ktra()
{
    for(int u=1;u<=n;u++)
    {
    	for(int v=u+1;v<=n;v++)
    	{
    		if(a[u][v]==1)
    		{
    			a[u][v]=0;
    			a[v][u]=0;
    			dfs(1);
    			for(int i=1;i<=n;i++)
    			{
    				if(check[i]==false)
    				{
    					cout<<u<<" "<<v<<endl;
    					break;
					}
				}
				a[u][v]=1;
				a[v][u]=1;
				rein();
			}
		}
	}
}
int main()
{
    
    in();
    ktra();
    return 0;
}
