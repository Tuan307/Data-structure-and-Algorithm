#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		int a[n+5],dp[n+5]={0};
		for(int i=1;i<=n;i++)
		{
			cin>>a[i];
		}
		dp[1]=a[1];
		dp[2]=max(a[1],a[2]);
		for(int i=3;i<=n;i++)
		{
			dp[i]=max(dp[i-2]+a[i],dp[i-1]);
		}
		cout<<dp[n]<<endl;	
	}
	return 0;
}
