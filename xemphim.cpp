#include<bits/stdc++.h>
using namespace std;
int res[101][25000];
int main()
{
	int w,n;
	cin>>w>>n;
	int a[n+1];
	for(int i=1;i<=n;i++)
	{
		cin>>a[i];
	}
	memset(res,0,sizeof(res));
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=w;j++)
		{
			if(j>a[i])
			res[i][j]=max(res[i-1][j],res[i-1][j-a[i]]+a[i]);
			else res[i][j]=res[i-1][j];
		}
	}
	cout<<res[n][w]<<endl;
	return 0;
}
