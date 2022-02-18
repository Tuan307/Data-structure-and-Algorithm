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
		int a[n+5];
		int count=0;
		for(int i=1;i<=n;i++)
		{
			cin>>a[i];
		}
		int check[n+1]={0};
		for(int i=1;i<=n;i++)
		{
			check[i]=1;
			for(int j=1;j<=n;j++)
			{
				if(a[i]>=a[j])
				{
					check[i]=max(check[i],check[j]+1);
					count=max(count,check[i]);
				}
			}
		}
		cout<<abs(n-count)<<endl;
	}
	return 0;
}

