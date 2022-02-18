#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n,x;
		bool ok=true;
		cin>>n>>x;
		int a[n+1];
		for(int i=1;i<=n;i++)
		{
			cin>>a[i];
		}
		for(int i=1;i<=n;i++)
		{
			if(x==a[i])
			{
				cout<<i<<endl;
				ok=false;
				break;
			}
		}
		if(ok) cout<<"-1"<<endl;
	}
	return 0;
}

