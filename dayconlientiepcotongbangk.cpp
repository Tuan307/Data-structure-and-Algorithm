#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		long long n,k;
		cin>>n>>k;
		long long a[n+5],dp[1000005]={0};
	//	dp[0]=1;
	    for(long long i=1;i<=n;i++)
	    {
	    	cin>>a[i];
		}
		for(long long i=1;i<=n;i++)
		{
			dp[a[i]]=1;
			for(long long j=k;j>=a[i];j--)
			{
				if(dp[j-a[i]]==1) dp[j]=1;
			}
		}
		if(dp[k]==1) cout<<"YES";
		else cout<<"NO";
		cout<<endl;
	}
	return 0;
}
