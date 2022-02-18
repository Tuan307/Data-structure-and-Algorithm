#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		int a[n+1];
		for(int i=0;i<n;i++)
		{
			cin>>a[i];
		}
		sort(a,a+n);
		int res=n;
		for(int i=n/2-1,j=n-1;i>=0&&j>=n/2;)
		{
				if(a[j]>=2*a[i])
				{
					res--;
					i--;
					j--;
				}
				else
				{
					i--;
				}
		}
		cout<<res<<endl;
	}
	return 0;
}
