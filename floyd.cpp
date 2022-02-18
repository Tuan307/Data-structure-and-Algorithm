#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
//#include <math.h>
#include <dos.h>
#define MAX 10000
#define TRUE 1
#define FALSE 0
int A[50][50], D[50][50], S[50][50];
int n, u, v, k;
void Init(void){
int i, j, k;

for(i=1; i<=n; i++)
for(j=1; j<=n; j++)
A[i][j]=0;
scanf("%d%d%d",&n,&u,&v);
printf("\n So dinh do thi:%d",n);
printf("\n Di tu dinh:%d den dinh %d:",u,v);
printf("\n Ma tran trong so:");
for(i=1; i<=n; i++){
//printf("\n");
for(j=1; j<=n; j++){
scanf("%d", &A[i][j]);
//printf("%5d",A[i][j]);
if(i!=j && A[i][j]==0)
A[i][j]=MAX;
}
}
}
void Result(void){
if(D[u][v]>=MAX) {
printf("\n Khong co duong di");
 return;
}
else {
printf("\n Duong di ngan nhat:%d", D[u][v]);
printf("\n Dinh %3d", u);
while(u!=v) {
printf("%3d",S[u][v]);
u=S[u][v];
}
}
}
void Floy(void){
int i, j,k, found;
for(i=1; i<=n; i++){
for(j=1; j<=n;j++){
D[i][j]=A[i][j];
if (D[i][j]==MAX) S[i][j]=0;
else S[i][j]=j;
}
}
for (k=1; k<=n; k++){
for (i=1; i<=n; i++){
for (j=1; j<=n; j++){
if (D[i][k]!=MAX && D[i][j]>(D[i][k]+D[k][j]) ){
// Tim D[i,j] nho nhat co the co
D[i][j]=D[i][k]+D[k][j];
S[i][j]=S[i][k];
//ung voi no la gia tri cua phan tu ngay sau i
}
}
}
}
}
int main(){
Init();
Floy();Result();
}

