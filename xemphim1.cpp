#include<iostream>
#include<string.h>
#include<algorithm>
using namespace std;
int dp[101][25000];
int main()
{
		int n,w;
		cin>>w>>n;
		int tui[n+1];
		for(int i=1;i<=n;i++)
		{
			cin>>tui[i];
		}
		int res=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=w;j++)
			{
				if(j<=tui[i])
				{
					dp[i][j]=dp[i-1][j];
				}
				else 
				{
					dp[i][j]=max(dp[i-1][j],dp[i-1][j-tui[i]]+tui[i]);
				}
				res=max(res,dp[i][j]);
			}
		}
		cout<<res<<endl;
	return 0;
}
