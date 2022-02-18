#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int main()
{
	long long  n,q;
	cin>>n>>q;
	long long a[n+5]={0};
	while(q--)
	{
		long long x,y;
		cin>>x>>y;
		for(long long i=x-1;i<y;i++)
		{
			if(a[i]==0)
			{
				a[i]=1;
			}
			else
			{
				a[i]=0;
			}
		}
	}
	for(long long i=0;i<n;i++)
	{
		cout<<a[i]<<" ";
	}
	return 0;
}
