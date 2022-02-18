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
		int a[1000];
		for(int i=0;i<n;i++)
		{
			cin>>a[i];
		}
		int l[1000];
		l[0]=1;
		int lmax;
		for(int i=1;i<n;i++)
		{
			lmax=0;
			for(int j=0;j<i;j++)
			{
				if(a[j]<=a[i])
				{
					if(l[j]>lmax)
					{
						lmax=l[j];
					}
				}
			}
			l[i]=lmax+1;
		}
		int res=0;
		for(int i=0;i<n;i++)
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

