#include<iostream>
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
    for(int i=1;i<=n;i++)
    {
        for(int j=i+1;j<=n;j++)
        {
            if(a[i][j]==1)
            {
                a[j][i]=0;
                a[i][j]=0;
                dfs(1);
                for(int v=1;v<=n;v++)
                {
                if(check[v]==false)
                {
                    cout<<i<<" "<<j<<endl;
                    break;
                }
                }
                a[i][j]=1;
                a[j][i]=1;
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
