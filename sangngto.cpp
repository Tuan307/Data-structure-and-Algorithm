#include<bits/stdc++.h>
using namespace std;
void sang(long long n)
{
	bool ok[10000]={false};
	for(long long i=2;i<=sqrt(n);i++)
	{
		if(!ok[i])
		{
			for(long long j=2*i;j<=n;j+=i)
			{
				ok[j]=true;
			}
		}
	}
	for(long long i=2;i<=n;i++)
	{
		if(!ok[i]) cout<<i<<" ";
	}
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		long long n;
		cin>>n;
		sang(n);
		cout<<endl;
	}
	return 0;
}

