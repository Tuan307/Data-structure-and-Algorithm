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
		int i=2;
		int count;
		int a;
		for(int i=2;i<=n;i++)
		{
			count=0;
			while(n%i==0)
			{
				count++;
				n/=i;
			}
			if(count!=0) cout<<i<<" "<<count<<" ";
		}
		cout<<endl;
	}
	return 0;
}
