#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n;
	cin>>n;
	int a[n];
	int b[n];
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
		b[i]=a[i];
	}
	sort(b,b+n);
	int count=0;
	for(int i=0;i<n;i++)
	{
		if(a[i]!=b[i])
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[j]==b[i])
				{
			swap(a[i],a[j]);
			count++;
			break;
		}
	}
		}
	}
	cout<<count;	
	return 0;
}

