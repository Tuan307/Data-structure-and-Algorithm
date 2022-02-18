#include<bits/stdc++.h>
using namespace std;
string s;
int act(int n)
{
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		int sum=0;
		for(int j=i;j<s.length();j++)
		{
			sum=sum*10+(s[j]-'0');
			sum=sum%n;
			if(sum==0) count=count+1;
		}
	}
	return count;
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		cin>>s;
		cout<<act(8)-act(24)<<endl;
	}
	return 0;
}

