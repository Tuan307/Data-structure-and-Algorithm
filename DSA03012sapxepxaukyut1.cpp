#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		string s;
		cin>>s;
		int d[300]={0};
		int res=0;
		for(int i=0;i<s.size();i++)
		{
			d[s[i]]++;
			res=max(res,d[s[i]]);
		}
		if(s.size()%2==0&&res<=s.size()-res)
		{
			cout<<"1";
		}
		else if(s.size()%2!=0&&res<=((s.size())/2)+1)
        {
			cout<<"1";
		}
		else cout<<"-1";
		cout<<endl;
	}
	return 0;
}

