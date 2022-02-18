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
		int a[n+1];
		for(int i=0;i<n;i++)
		{
			cin>>a[i];
		}
		int maxend=0;
		int maxcur=a[0];
		for(int i=1;i<n;i++)
		{
			maxcur=max(a[i],maxcur+a[i]);
			maxend=max(maxend,maxcur);
		}
		cout<<maxend<<endl;
	}
	return 0;
}

