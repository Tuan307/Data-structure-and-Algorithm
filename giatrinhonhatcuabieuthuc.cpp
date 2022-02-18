#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		long long n;
		cin>>n;
		long long a[n+1],b[n+1];
		for(long long i=0;i<n;i++)
		{
			cin>>a[i];
		}
		sort(a,a+n);
		for(long long i=0;i<n;i++)
		{
			cin>>b[i];
		}
		sort(b,b+n);
		long long res=0;
		for(long long i=0;i<n;i++)
		{
			res+=a[i]*b[n-i-1];
		}
		cout<<res<<endl;
	}
	return 0;
}
