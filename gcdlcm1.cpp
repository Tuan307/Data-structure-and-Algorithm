#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		long long a,b;
		cin>>a>>b;
		long long uoc=__gcd(a,b);
		long long boi=(a*b)/uoc;
		cout<<boi<<" "<<uoc;
		cout<<endl;
	}
	return 0;
}
