/*12
0 1 0 1 0 0 0 0 0 0 0 0
1 0 1 0 0 0 0 0 0 0 0 0
0 1 0 1 0 0 0 0 0 0 0 0
1 0 1 0 0 1 0 0 0 0 0 0
0 0 0 0 0 1 0 1 0 0 0 0
0 0 0 1 1 0 1 0 0 0 0 0
0 0 0 0 0 1 0 1 0 0 0 0
0 0 0 0 1 0 1 0 0 1 0 0
0 0 0 0 0 0 0 0 0 1 0 0
0 0 0 0 0 0 0 1 1 0 1 0
0 0 0 0 0 0 0 0 0 1 0 1
0 0 0 0 0 0 0 0 0 0 1 0
*/ //4 6 8 10 11
#include<iostream>
#include<stack>
#include<vector>
using namespace std;
int n;
int a[100][100];
vector<int> v;
bool check[100];
void in()
{
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            cin>>a[i][j];
        }
        check[i]=false;
    }
}
void rein()
{
    for(int i=1;i<=n;i++)
    {
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
void ktra()
{
    for(int i=1;i<=n;i++)
    {
        check[i]=true;
        dfs(1);
        for(int j=1;j<=n;j++)
    {
        if(check[j]==false)
        {
            cout<<i<<" ";
            break;
        }
    }
        rein();
    }
}
int main()
{
    cin>>n;
    in();
    ktra();
    return 0;
}
