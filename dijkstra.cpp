#include<iostream>
#define INF 1000000
using namespace std;
class dothi
{
    int n,c[100][100];
    public:
    bool chuaxet[100];
    int s,d[100],truoc[100];
    void read();
    void in(int s);
    void djk(int s);
};
void dothi::read()
{
    cin>>n>>s;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            cin>>c[i][j];
            if(c[i][j]==0) c[i][j]=INF;
        }
    }
}
void dothi::in(int s)
{
    for(int v=1;v<=n;v++)
    {
        d[v]=c[s][v];
        truoc[v]=s;
        chuaxet[v]=true;
    }
    d[s]=0;
    chuaxet[s]=false;
}
void dothi::djk(int s)
{
    in(s);
    for(int i=1;i<=n;i++)
    {
        if(chuaxet[i]==true)
    {
        int u=0,du=INF;
        for(int z=1;z<=n;z++)
            if(chuaxet[z]==true&&d[z]<du)
            {
                u=z;
                du=d[z];
            }
            if(u!=0)
            {
                chuaxet[u]=false;
                for(int v=1;v<=n;v++)
                    if(chuaxet[v]==true&&d[v]>du+c[u][v])
                    {
                        d[v]=du+c[u][v];
                        truoc[v]=u;
                    }
            }
            else 
            {
                chuaxet[i]=false;
            }
            i=0;
    }
    }
    for(int t=1;t<=n;t++)
        if(d[t]==INF)
        {
            cout<<"\n"<<"K/c "<<s<<" -> "<<t<<" = INF;";
        }
        else
        {
            cout<<"\n"<<"K/c "<<s<<" -> "<<t<<" = "<<d[t]<<";";
            cout<<"\t"<<t<<" <- ";
            int tmp=truoc[t];
            while(tmp!=s)
            {
                cout<<tmp<<" <- ";
                tmp=truoc[tmp];
            }
        cout<<s;
        }
    
}
int main()
{
    dothi g;
    g.read();
    g.djk(g.s);
    return 0;
}
