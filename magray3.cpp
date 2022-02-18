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
		string s1=s;
		for(int i=0;i<s.size();i++)
		{
			if(s[i]=='1')
			{
				if(s[i+1]=='1')
				{
					s1[i+1]='0';
				}
				else s1[i+1]='1';
			}
		}
		for(int i=0;i<s1.size();i++)
		{
			cout<<s1[i];
		}
		cout<<endl;
	}
	return 0;
}

