#include <iostream>
#define MAX 100
using namespace std;
struct  edg{ int    d, c, h; };
class dothi{
    int     n, a[MAX][MAX], atree[MAX][MAX];
    public:
    int     ne;
    edg     graph[MAX], tree[MAX];
    bool    chuaxet[MAX];
    void    readdata();
    void    init();
    void    bubblesort();
    void    dfstree(int u);
    void    kruskal();
};
void    dothi::readdata(){
    cin>>n; ne=0;
    for(int i=1; i<=n; i++)
        for(int j=1; j<=n; j++){
            cin>>a[i][j];
            if((a[i][j]!=0)&&(i<j)){
                ne++;   graph[ne].d=i;  graph[ne].c=j;  graph[ne].h=a[i][j];
            }
        }
}
void    dothi::init(){  for(int i=1; i<=n; i++) chuaxet[i]=true;    }
void    dothi::bubblesort(){
    for(int i=1; i<ne; i++)
        for(int j=ne; j>i; j--)
            if(graph[j].h<graph[j-1].h) swap(graph[j], graph[j-1]);
}
void    dothi::dfstree(int u){
    chuaxet[u]=false;
    for(int i=1; i<=n; i++)
        if((atree[u][i]==1)&&(chuaxet[i]==true)) dfstree(i);
}
void    dothi::kruskal(){
    int dT=0, net=0;
    for(int i=1; i<=n; i++)
        for(int j=1; j<=n; j++) atree[i][j]=0;
    bubblesort();
    for(int i=1; i<=ne; i++){
        init(); dfstree(graph[i].d);
        if(chuaxet[graph[i].c]==true){//bo sung canh i vao cay ko tao nen chu trinh
            int dau=graph[i].d, cuoi=graph[i].c;
            net++;  tree[net].d=dau; tree[net].c=cuoi;
            atree[dau][cuoi]=atree[cuoi][dau]=1;    dT+=graph[i].h;
        }
    }
    cout<<"dH = "<<dT<<endl;
    for(int i=1; i<=net; i++) cout<<tree[i].d<<"   "<<tree[i].c<<endl;
}
int main(){
  dothi   g; 
  g.readdata(); 
  g.kruskal(); 
}
