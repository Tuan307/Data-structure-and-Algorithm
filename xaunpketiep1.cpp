#include<bits/stdc++.h>
using namespace std;
bool ok=true;
void out(string s)
{
	for(int i=0;i<s.size();i++)
	{
		cout<<s[i];
	}
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		string s;
		cin>>s;
		int i=s.size()-1;
	while(i>=0&&s[i]!='0')
	{
		s[i]='0';
		i--;
	}
	if(i>0)
	{
		s[i]='1';
	}
	else 
	{
	    for(int i=0;i<s.size();i++)
		{
			s[i]='0';
			}	
	}
	out(s);
		cout<<endl;
	}
	return 0;
}

