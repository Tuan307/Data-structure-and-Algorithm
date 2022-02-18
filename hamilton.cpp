#include<iostream>
#include<vector>
using namespace std;
int n,v;
int check[100]={0};
int route[100];
vector<int> vt[100];
void in()
{
    int tmp;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            cin>>tmp;
            if(tmp==1)
            {
                vt[i].push_back(j);
            }
        }
    }
}
void out()
{
    for(int i=1;i<=n;i++)
    {
        cout<<route[i]<<" ";
    }
    cout<<v<<endl;
}
void hamilton(int k)
{
    for(int i=0;i<vt[route[k-1]].size();i++)
    {
        if(k==n+1&&vt[route[k-1]][i]==v)
        {
            out();
        }
        else if(check[vt[route[k-1]][i]]==0)
        {
            check[vt[route[k-1]][i]]=1;
            route[k]=vt[route[k-1]][i];
            hamilton(k+1);
            check[vt[route[k-1]][i]]=0;
        }
    }
}
int main()
{
    cin>>n>>v;
    in();
    check[v]=1;
    route[1]=v;
    hamilton(2);
    return 0;
}
