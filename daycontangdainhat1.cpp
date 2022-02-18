#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
    int n;
	cin>>n;
	int a[n+1];
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
	}
	int lmax;
	int l[100];
	 l[0]=1;
	for(int i=1;i<n;i++)
	{
		lmax=0;
		for(int j=0;j<i;j++)
		{
			if(a[i]>a[j])
			{
				if(lmax<l[j])
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
	cout<<res;	
	return 0;
}

