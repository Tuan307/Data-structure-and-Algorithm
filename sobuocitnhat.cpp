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
		long long a[n+5];
		for(long long i=0;i<n;i++)
		{
			cin>>a[i];
		}
		long long l[n+5];
		l[0]=1;
		long long lmax;
		for(long long i=1;i<n;i++)
		{
			lmax=0;
			for(long long j=0;j<i;j++)
			{
				if(a[j]<=a[i])
				{
					if(lmax<l[j])
					{
						lmax=l[j];
					}
				}
			}
			l[i]=lmax+1;
		}
		long long res=0;
		for(long long i=0;i<n;i++)
		{
			if(l[i]>res)
			{
				res=l[i];
			}
		}
		cout<<n-res<<endl;
	}
	return 0;
}
