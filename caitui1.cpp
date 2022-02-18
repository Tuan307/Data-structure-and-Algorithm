#include<iostream>
#include<string.h>
#include<algorithm>
using namespace std;
struct dta{
	int a;
	int c;
};
int dp[1001][1005];
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n,v;
		cin>>n>>v;
		dta tui[n+1];
		for(int i=1;i<=n;i++)
		{
			cin>>tui[i].a;
		}
		for(int i=1;i<=n;i++)
		{
			cin>>tui[i].c;
		}
		int res=0;
		memset(dp,0,sizeof(dp));
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=v;j++)
			{
				if(j<tui[i].a)
				{
					dp[i][j]=dp[i-1][j];
				}
				else 
				{
					dp[i][j]=max(dp[i-1][j],dp[i-1][j-tui[i].a]+tui[i].c);
				}
				res=max(res,dp[i][j]);
			}
		}
		cout<<res<<endl;
	}
	return 0;
}
