#include<iostream>
#include<string>
using namespace std;
int main()
{
	string s;
	getline(cin,s);
    int res;
	for(int i=s.size()-1;;i--)
	{
		if(s[i]==' ')
		{
			res=i;
			break;
		}
	}
	for(int i=res+1;i<s.size();i++)
	{
		if(s[i]>=65&&s[i]<=90)
		{
			s[i]+=32;
		}
		cout<<s[i];
	}
	if(s[0]!=' ')
	{
		if(s[0]>=65&&s[0]<=90)
		{
			s[0]+=32;
		}
		cout<<s[0];
	}
	for(int i=res-1;;i--)
	{
		if(s[i]==' ')
		{
			if(s[i]>=65&&s[i]<=90)
		{
			s[i]+=32;
		}
			cout<<s[i+1];
			break;
		}
	}
	cout<<"@ptit.edu.vn";	
	return 0;
}

