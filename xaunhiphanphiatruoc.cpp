#include<iostream>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	string s;
	cin>>s;
	bool ok=true;
	int count=0;
	for(int i=0;i<s.size();i++)
	{
		if(s[i]=='0')
		{
			count++;
		}
	}
	if(count==s.size()) ok=false;
	if(!ok) 
	{
		for(int i=0;i<s.size();i++)
		{
			cout<<1;
		}
	}
	else
	{
	int i=s.size()-1;
	while(i>=0&&s[i]!='1') i--;
	s[i]='0';
	if(i>=0)
	{
		for(int j=i+1;j<=s.size()-1;j++)
		{
			s[j]='1';
		}
	}
	    cout<<s;
	}
	cout<<endl;
}
	return 0;
}	
