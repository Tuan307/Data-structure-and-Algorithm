#include<iostream>
#include<stack>
#include<queue>
#define max 100
using namespace std;
struct edg{
  int dau,cuoi,h;  
};
class dothi
{
    int n,a[max][max],ne,atree[max][max];
    edg g[max],tree[max];
    public:
    int s;
    bool chuaxet[max];
    void read();
    void in();
    void dfs(int u);
    void bubble();
    void prim(int s);
};
void dothi::read()
{
    cin>>n>>s;
    ne=0;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            cin>>a[i][j];
            if(a[i][j]!=0&&i<j)
            {
                ne++;
                g[ne].dau=i;
                g[ne].cuoi=j;
                g[ne].h=a[i][j];
            }
        }
    }
}
void dothi::in()
{
    for(int i=1;i<=n;i++)
    chuaxet[i]=true;
}
void dothi::dfs(int u)
{
    chuaxet[u]=false;
    for(int i=1;i<=n;i++)
    {
        if(chuaxet[i]==true&&atree[u][i]==1)
        {
            dfs(i);
        }
    }
}
void dothi::bubble()
{
    for(int i=1;i<ne;i++)
    {
        for(int j=ne;j>=i+1;j--)
        {
            if(g[j].h<g[j-1].h)
            {
                swap(g[j],g[j-1]);
            }
        }
    }
}
void dothi::prim(int s)
{
    int dh=0;
    int net=0;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            atree[i][j]=0;
        }
    }
    bubble();
    while(net!=n-1)
    {
        for(int i=1;i<=ne;i++)
        {
            in();
            dfs(s);
            int dau=g[i].dau;
            int cuoi=g[i].cuoi;
            //if((chuaxet[dau]&&chuaxet[cuoi])==false&&((chuaxet[dau]||chuaxet[cuoi])==true))
            if(chuaxet[dau]!=chuaxet[cuoi])
            {
               net++;
               tree[net].dau=dau;
               tree[net].cuoi=cuoi;
               dh+=g[i].h;
               atree[dau][cuoi]=atree[cuoi][dau]=1;
               break;
            }
        }
    }
    cout<<"dH = "<<dh<<endl;
    for(int i=1;i<=net;i++)
    {
        cout<<tree[i].dau<<" "<<tree[i].cuoi<<endl;
    }
}
int main()
{
    dothi g;
    g.read();
    g.prim(g.s);
}
