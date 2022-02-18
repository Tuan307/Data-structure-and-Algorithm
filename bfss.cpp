#include<iostream>
#include<queue>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int a[n+1][n+1];
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            cin>>a[i][j];
        }
    }
    queue<int> q;
    int check[n+1]={0};
    q.push(2);
    cout<<"2"<<" ";
    check[1]=1;
    while(q.size()>0)
    {
        int k=q.front();
        q.pop();
        for(int i=1;i<=n;i++)
        {
            if(check[i]==0&&a[k][i]==1)
            {
                cout<<i<<" ";
                q.push(i);
                check[i]=1;
            }
        }
    }
    cout<<endl;
    return 0;
}
