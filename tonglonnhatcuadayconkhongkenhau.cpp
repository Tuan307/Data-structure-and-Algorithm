/*
khoi tao gia tri dp[1]=a[1]
dp[2]= max(a[1],a[2])
sau do tu dp[3]=max(dp[i-2]+a[i],d[i-1]) tuc la so sanh giua so ko lien ke i va i hien tai voi i truoc no de ko bo sot
cout<<dp[n]
*/
#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int main()
{

		int n;
		cin>>n;
		int sum=0;
		int sum1=0;
		int a[n+5],dp[n+5]={0};
		for(int i=1;i<=n;i++)
		{
			cin>>a[i];
			sum1+=abs(a[i]);
		}
		dp[1]=a[1];
		dp[2]=max(a[1],a[2]);
		for(int i=3;i<=n;i++)
		{
			dp[i]=max(dp[i-2]+a[i],dp[i-1]);
		}
		cout<<dp[n]+sum1<<endl;
	
	return 0;
}
