#include<bits/stdc++.h>
using namespace std;
bool ok=true;
void act(string s)
{
	int i=s.size()-1;
	while(i>0&&s[i]!='0')
	{
		s[i]='0';
		i--;
	}
	if(i>0) s[i]='1';
	else ok=false;
}
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
		act(s);
		ok=true;
		cout<<endl;
	}
	return 0;
}

