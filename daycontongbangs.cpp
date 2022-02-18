#include<bits/stdc++.hz>
using namespace std;
int main()
{
	
		int n,s;
		cin>>n>>s;
		int a,dp[40005]={0};
		dp[0]=1;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			cin>>a;
			dp[a]=1;
			for(int j=s;j>=a;j--)
			{
				if(dp[j-a]==1){
				 dp[j]=1;
				 count++;
			}
		}
		if(dp[s]==1) cout<<count<<endl;
		//else cout<<"NO"<<endl;
	
	return 0;
}

