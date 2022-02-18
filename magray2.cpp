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
		for(int i=0;i<s.size();i++)
		{
			if(s[i]=='1')
			{
				if(s[i+1]=='1')
				{
					s[i+1]='0';
				}
				else s[i+1]='1';
			}
		}
		for(int i=0;i<s.size();i++)
		{
			cout<<s[i];
		}
		cout<<endl;
	}
	return 0;
}

