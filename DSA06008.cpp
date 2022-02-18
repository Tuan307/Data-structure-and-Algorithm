#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n,m;
		cin>>n>>m;
		int a[n+1],b[m+1];
		for(int i=0;i<n;i++)
		{
			cin>>a[i];
		}
		for(int i=0;i<m;i++)
		{
			cin>>b[i];
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
			    if(pow(a[i],b[j])>pow(b[j],a[i]))
			    {
			    	count++;
				}
			}
		}
		cout<<count<<endl;
	}
	return 0;
}

