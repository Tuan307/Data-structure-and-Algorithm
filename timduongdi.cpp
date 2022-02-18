#include<bits/stdc++.h>
using namespace std;
  int n;
  int a[105][105];
  int s;
  int t;
  int check[105]={0};
  int way[105]={0};
void dfs()
{
    stack<int> st;
    st.push(s);
    check[s]=1;
    while(st.size()>0)
    {
        int tmp=st.top();
        st.pop();
    for(int i=1;i<=n;i++)
    {
        if(a[tmp][i]==1&&check[i]==0)
        {
            check[i]=1;
            st.push(tmp);
            st.push(i);
            way[i]=tmp;
            break;
        }
    }
    }
}
void bfs()
{
    queue<int> q;
    q.push(s);
    check[s]=1;
    while(q.size()>0)
    {
        int tmp=q.front();
        q.pop();
    for(int i=1;i<=n;i++)
    {
        if(a[tmp][i]==1&&check[i]==0)
        {
            check[i]=1;
            q.push(i);
            way[i]=tmp;
            
        }
    }
    }
}
void rote()
{
    int i=t;
    cout<<i<<" ";
    while(way[i]!=s)
    {
        cout<<way[i]<<" ";
        i=way[i];
    }
    cout<<s<<endl;
}
int main()
{
   cin>>n>>s>>t;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            cin>>a[i][j];
        }
    }
    dfs();
    if(way[t]==0)
    {
        cout<<"no path"<<endl;
    }
    else
    {
        cout<<"DFS path: ";
        rote();
        for(int i=1;i<=100;i++)
        {
            check[i]=0;
            way[i]=0;
        }
        bfs();
        cout<<"BFS path: ";
        rote();
    }
    return 0;
}
