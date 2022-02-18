#include<bits/stdc++.h>
using namespace std;
string sub(string a,string b)
{
	while(a.size()<b.size()) a="0"+a;
	while(a.size()>b.size()) b="0"+b;
	if(a<b) a.swap(b);
	int nho=0;
	string res="";
	for(int i=a.size()-1;i>=0;i--)
	{
		int so=(a[i]-'0')-(b[i]-'0')-nho;
		if(so<0)
		{
			res=char(so+10+'0')+res;
			nho=1;
		}
		else 
		{
	        res=char(so+'0')+res;
	        nho=0;
		}
	}
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
		cout<<sub(a,b)<<endl;
	}
	return 0;
}

