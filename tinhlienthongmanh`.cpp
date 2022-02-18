#include<bits/stdc++.h>
using namespace std;
int n;
int a[1000][1000];
bool check[1000];
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
int bfs(int u)
{
    queue<int> q;
    q.push(u);
    check[u]=true;
    int count=0;
    while(!q.empty())
    {
        int tmp=q.front();
        q.pop();
        count++;
        for(int j=1;j<=n;j++)
        {
            if(check[j]==false&&a[tmp][j]==1)
            {
                q.push(j);
                check[j]=true;
            }
        }
    }
    return count;
}
void rein()
{
    for(int i=1;i<=n;i++)
    {
        check[i]=false;
    }
}
bool ktra()
{
    for(int i=1;i<=n;i++)
    {
        if(bfs(i)!=n)
        {
            return false;
            break;
        }
        rein();
    }
    return true;
}
int main()
{
    cin>>n;
    in();
    if(ktra()==true)
    {
        cout<<"strongly connected"<<endl;
    }
    else cout<<"not strongly connected"<<endl;
    return 0;
}
