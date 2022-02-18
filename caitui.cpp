#include<bits/stdc++.h>
using namespace std;
struct bags{
	int a=0;
	int c=0;
};
int res[1000][1005];
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	int w,n;
	cin>>n>>w;
	bags bag[n+1];
	for(int i=1;i<=n;i++)
	{
		cin>>bag[i].a;
	}
	for(int i=1;i<=n;i++)
	{
		cin>>bag[i].c;
	}
	memset(res,0,sizeof(res));
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=w;j++)
		{
			if(j>=bag[i].a)
			res[i][j]=max(res[i-1][j],res[i-1][j-bag[i].a]+bag[i].c);
			else res[i][j]=res[i-1][j];
		}
	}
	cout<<res[n][w]<<endl;
}
	return 0;
}
