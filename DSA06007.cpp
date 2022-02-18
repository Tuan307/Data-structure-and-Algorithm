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
		int a[n+1],b[n+1];
		for(int i=0;i<n;i++)
		{
			cin>>a[i];
			b[i]=a[i];
		}
		sort(a,a+n);
		int first=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]!=b[i])
			{
				first=i;
				break;
			}
		}
		int last=0;
		for(int i=n-1;i>=0;i--)
		{
			if(a[i]!=b[i])
			{
				last=i;
				break;
			}
		}
		cout<<first+1<<" "<<last+1<<endl;
	}
	return 0;
}

