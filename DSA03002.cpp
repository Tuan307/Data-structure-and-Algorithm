#include<bits/stdc++.h>
using namespace std;
long long minn(string a,string b)
{
	long long min1=0;
	for(int i=0;i<a.size();i++)
	{
		if(a[i]-'0'==6)
		{
			a[i]='5';
		}
		min1=min1*10+(a[i]-'0');
	}
	long long min2=0;
	for(int i=0;i<b.size();i++)
	{
		if(b[i]-'0'==6)
		{
			b[i]='5';
		}
		min2=min2*10+(b[i]-'0');
	}
	return min1+min2;
}
long long maxx(string a,string b)
{
	long long min1=0;
	for(int i=0;i<a.size();i++)
	{
		if(a[i]-'0'==5)
		{
			a[i]='6';
		}
		min1=min1*10+(a[i]-'0');
	}
	long long min2=0;
	for(int i=0;i<b.size();i++)
	{
		if(b[i]-'0'==5)
		{
			b[i]='6';
		}
		min2=min2*10+(b[i]-'0');
	}
	return min1+min2;
}
int main()
{
	string a,b;
	cin>>a>>b;
	cout<<minn(a,b)<<" "<<maxx(a,b);
	return 0;
}

