#include<iostream>
#include<vector>
#include<stack>
#include<queue>
using namespace std;
int n,v;
vector<int> vt[100];
vector<int> a;
int check[100]={0};
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
    for(int i=0;i<a.size();i+=2)
    {
        cout<<a[i]<<" "<<a[i+1]<<endl;
    }
}
void dfstree(int v)
{
    check[v]=1;
    for(int i=0;i<vt[v].size();i++)
    {
        if(check[vt[v][i]]==0)
        {
            a.push_back(v);
            a.push_back(vt[v][i]);
            dfstree(vt[v][i]);
        }
    }
}
void bfstree(int v)
{
    queue<int> q;
    check[v]=1;
    q.push(v);
    while(!q.empty())
    {
        int s=q.front();
        q.pop();
        for(int i=0;i<vt[s].size();i++)
        {
            if(check[vt[s][i]]==0)
            {
                q.push(vt[s][i]);
                a.push_back(s);
                a.push_back(vt[s][i]);
                check[vt[s][i]]=1;
            }
        }
    }
}
int main()
{
    cin>>n>>v;
    in();
    dfstree(v);
    cout<<"DFS tree"<<endl;
    out();
    a.clear();
    for(int i=0;i<100;i++)
    {
        check[i]=0;
    }
    cout<<"BFS tree"<<endl;
    bfstree(v);
    out();
    return 0;
}
