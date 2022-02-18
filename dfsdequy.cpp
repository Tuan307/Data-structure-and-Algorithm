#include<iostream>
using namespace std;
int a[100][100];
int n;
int check[1000]={0};
void Try(int u)
{
cout<<u<<" ";
check[u]=1;
int v;
for(v=1;v<=n;v++)
{
if(a[u][v]==1&&check[v]==0)
{
Try(v);
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
Try(1);
return 0;
}
