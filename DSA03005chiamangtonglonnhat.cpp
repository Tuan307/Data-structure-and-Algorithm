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
		long long sum1=0;
		long long sum2=0;
		int j=0;
		while(j<n)
		{
			if(j<k) sum1+=a[j];
		    else sum2+=a[j];
		    j++;
		}
		long long res=0;
		res=abs(sum1-sum2);
		sum1=sum2=0;
		j=0;
		while(j<n)
		{
			if(j<n-k) sum1+=a[j];
			else sum2+=a[j];
			j++;
		}
		res=max(res,abs(sum1-sum2));
		cout<<res<<endl;
	}
	return 0;
}

