#include<bits/stdc++.h>
#include<set>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		long long n;
		cin>>n;
		long long a[n+1];
		for(long long i=0;i<n;i++)
		{
			cin>>a[i];
		}
		set<int> v;
		for(long long i=0;i<n;i++)
		{
			int t;
			while(a[i]!=0)
			{
				t=a[i]%10;
				v.insert(t);
				a[i]/=10;
			}
		}
		//sort(v.begin(),v.end());
		for (set<int>:: iterator it = v.begin(); it != v.end(); it++)
		{
	        cout<< *it << " ";
	    }
	    cout<<endl;
	}
	return 0;
}

