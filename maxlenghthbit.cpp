#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		int a[n+1];
		for(int i=0;i<n;i++)
		{
			cin>>a[i];
		}
		int sum1=0;
		int sum2=0;
		int res=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==0) sum1++;
			else if(a[i]==1) sum2++;
			if(sum1==sum2)
			{
				res=max(sum1+sum2,res);
			}
		}
		cout<<res;
	}
	return 0;
}

