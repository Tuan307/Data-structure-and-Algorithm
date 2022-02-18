#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int k;
		cin>>k;
		string s;
		cin>>s;
		int d[300]={0};
		int res=0;
		for(int i=0;i<s.size();i++)
		{
			d[s[i]]++;
			res=max(res,d[s[i]]);
		}
		if((res-1)*(k-1)>s.size()-res) cout<<"-1";
		else cout<<"1";
		cout<<endl;
	}
	return 0;
}

