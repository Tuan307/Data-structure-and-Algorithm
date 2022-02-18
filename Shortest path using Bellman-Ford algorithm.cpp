#include<bits/stdc++.h>
using namespace std;
int n,s;
int a[100][100];
int Max=1000000;
int d[100],truoc[100];
void khoitao(){
    for(int i=1;i<=n;++i){
        d[i]=a[s][i];
        truoc[i]=s;
    }
    d[s]=0;
}
void handless(){
    for(int k=1;k<=n-2;++k){
        for(int v=1;v<=n;++v){
            if(v!=s){
                for(int u=1;u<=n;++u){
                    if((d[v]>d[u]+a[u][v])&&(a[u][v]!=Max)&&(d[u]!=Max)){
                        d[v]=d[u]+a[u][v];
                        truoc[v]=u;
                    }
                }
            }
        }
    }
}
void output(){
    for(int i=1;i<=n;++i){
        if(d[i]==Max){
            cout<<"K/c "<<s<<" -> "<<i<<" = "<<"INF;";
        }
        else{
            cout<<"K/c "<<s<<" -> "<<i<<" = "<<d[i]<<"; ";
            cout<<i<<" <- ";
            int u=truoc[i];
            while(u!=s){
                cout<<u<<" <- ";
                u=truoc[u];
            }
            cout<<s<<endl;
        }
    }
}
int main(){
    cin>>n>>s;
    for(int i=1;i<=n;++i){
        for(int j=1;j<=n;++j){
            cin>>a[i][j];
            if(a[i][j]==0){
                a[i][j]=Max;
            }
        }
    }
    khoitao();
    handless();
    output();
    return 0;
}
