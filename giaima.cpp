#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		string s;
		cin>>s;
		if(s[0]=='0')
		{
			cout<<0<<endl;
			continue;
		}
		int n=s.size();
		int res[n+1];
		res[0]=1;
		res[1]=1;
		for(int i=2;i<=n;i++)
		{
			res[i]=0;
			if(s[i-1]>'0')
			{
				res[i]=res[i-1];
			}
			if(s[i-2]=='1'||(s[i-2]=='2'&&s[i-1]<'7'))
			{
				res[i]+=res[i-2];
			}
		}
		cout<<res[n]<<endl;
	}
	return 0;
}
