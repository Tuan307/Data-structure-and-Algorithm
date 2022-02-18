#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	long long b,dem,l,i;
	long long n,t1;
	while(t--)
	{
		cin>>b>>n;
		l=b/n;
		b=b%n;
		t1=0;
		for(i=1;i<=b;i++)
		{
			if(i*i%n==1) t1++;
		}
		dem=t1;
		for(i=b+1;i<n;i++)
		{
			if(i*i%n==1) t1++;
		}
		dem=dem+l*t1;
		cout<<dem<<endl;
	}
	return 0;
}

