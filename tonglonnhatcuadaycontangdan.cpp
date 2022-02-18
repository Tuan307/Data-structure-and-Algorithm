/*
dp[i]=a[i]
for(int j=1;j<i;j++)
{
if(a[i]>a[j]) cap nhat lai dp[i]=max(dp[i],dp[j]+a[i]);
res=max(res,dp[i])
cout<<res;
*/
#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int main()
{
	

		int n;
		cin>>n;
		int a[n+5];
		long long dp[n+5]={0};
		for(int i=1;i<=n;i++)
		{
			cin>>a[i];
		}
		long long res=0;
		for(int i=1;i<=n;i++)
		{
			dp[i]=a[i];
			for(int j=1;j<i;j++)
			{
				if(a[i]>a[j]) dp[i]=max(dp[j]+a[i],dp[i]);
			}
			res=max(res,dp[i]);
		}
		cout<<res<<endl;
	
	return 0;
}
