#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		long long n;
		cin>>n;
		vector<int> a;
		while(n!=0)
		{
			a.push_back(n%10);
			n/=10;
		}
		reverse(a.begin(),a.end());
		int vt=a.size();
		for(int i=0;i<a.size();i++)
		{
			if(a[i]>=2)
			{
				vt=i;
				break;
			}
		}
		for(int i=vt;i<a.size();i++)
		{
			a[i]=1;
		}
		long long res=0;
		long long p=1;
		for(int i=a.size()-1;i>=0;i--)
		{
			res+=a[i]*p;
			p*=2;
		}
		cout<<res<<endl;
	}
	return 0;
}

