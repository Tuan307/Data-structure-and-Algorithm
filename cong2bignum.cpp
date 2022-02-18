#include<bits/stdc++.h>
using namespace std;
string sum(string a,string b)
{
	while(a.size()<b.size()) a="0"+a;
	while(a.size()>b.size()) b="0"+b;
	int len=a.size()-1;
	int nho=0;
	string res="";
	for(int i=len;i>=0;i--)
	{
		int tmp(a[i]-'0'+b[i]-'0'+nho;
		nho=tmp/10;
		tmp=tmp%10;
		res=char(tmp+'0')+res;
	}
	if(nho>0) res="1"+res;
	return res;
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
        string a,b;
        cin>>a>>b;
        cout<<sum(a,b)<<endl;
	}
	return 0;
}

