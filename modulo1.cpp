#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		long long x,y,p;
		cin>>x>>y>>p;
		long long res=1;
		while(y>0)
		{
			if(y%2!=0)
			{
				res=(res*x)%p;
			}
			y/=2;
			x=(x*x)%p;
		}
		cout<<res<<endl;
	}
	return 0;
}

