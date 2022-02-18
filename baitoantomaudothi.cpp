#include <iostream>
#include <cstring>
using namespace std;
 
int n, a[100][100],sm=0,m[10];
 
void docfile(){
    cin>>n;
    for(int i=1;i<=n;i++)
    {
    	for(int j=1;j<=n;j++)
    	{
    		cin>>a[i][j];
		}
	}
}
 
void xuly(){ //Xu ly de cho ra ket qua vao mang m[]
    int kt;
    for(int i=1;i<=n;i++)
        if(!m[i]) {
            sm++; //Dem so mau
            m[i]=sm;
            for(int j=i+1;j<=n;j++) //Kiem tra xem nhung dinh nao co the gan bang mau sm nua khong
                if((a[i][j]==0)&&(m[j]==0)){
                    kt=1;
                    for(int k=i+1;k<j;k++)
                        if((a[k][j]==1)&&(m[i]==m[k])){
                            kt=0;
                            break;
                        }
                    if(kt==1) m[j]=sm;
                }                   
        }
}
void xuatkq(){
    for(int i=1;i<=sm;i++){
        cout << "Mau " << i << ": ";
        for(int j=1;j<=n;j++) if(m[j]==i) cout << j << " ";
        cout << endl;
    }
}
int main(){
    docfile();
    xuly();
    xuatkq();
    return 0;
}
