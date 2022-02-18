#include<bits/stdc++.h>
using namespace std;
int a[105][105],n;
int maxrow()
{
	int res=0;
	for(int i=0;i<n;i++)
	{
		int sum=0;
		for(int j=0;j<n;j++)
		{
			sum+=a[i][j];
		}
		res=max(sum,res);
	}
	return res;
}
int maxcol()
{
	int res=0;
	for(int i=0;i<n;i++)
	{
		int sum=0;
		for(int j=0;j<n;j++)
		{
			sum+=a[j][i];
		}
		res=max(sum,res);
	}
	return res;
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		cin>>n;
		int suma=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				cin>>a[i][j];
				suma+=a[i][j];
			}
		}
		int m=max(maxcol(),maxrow());
		int ans=2*n*m-2*suma;
		cout<<ans/2<<endl;
	}
	return 0;
}

