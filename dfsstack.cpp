#include<iostream>
#include<stack>
using namespace std;
int a[100][100];
int n;
int check[1000]={0};
void Try(int u)
{
    stack<int> q;
    int s,i;
    q.push(u);
    check[u]=1;
    cout<<u<<" ";
    while(!q.empty())
    {
        s=q.top();
        q.pop();
    for(i=1;i<=n;i++)
    {
        if(check[i]==0&&a[s][i]==1)
        {
            cout<<i<<" ";
            check[i]=1;
            q.push(s);
            q.push(i);
            break;
        }
    }
}
}
int main()
{
    cin>>n;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            cin>>a[i][j];
        }
    }
    Try(2);
    return 0;
}
