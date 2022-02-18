#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n,k;
		cin>>n>>k;
		int a[n+1];
		for(int i=0;i<n;i++)
		{
			cin>>a[i];
		}
		sort(a,a+n);
		int count=0;
		for(int i=n-1;i>=0;i--)
		{
			count++;
			cout<<a[i]<<" ";
			if(count==k)
			{
				break;
			}
		}
		cout<<endl;
	}
	return 0;
}

