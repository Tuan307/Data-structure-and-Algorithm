#include<bits/stdc++.h>
using namespace std;
bool issmaller(string a,string b)
{
	int n1=a.size();
	int n2=b.size();
	if(n1<n2) return true;
	if(n2<n1) return false;
	for(int i=0;i<n1;i++)
	{
		if(a[i]<b[i]) return true;
		else if(a[i]>b[i]) return false;
	}
	return false;
}
string find(string a,string b)
{
	if(issmaller(a,b))
	{
		swap(a,b);
	}
	string res="";
	int n1=a.size(),n2=b.size();
	reverse(a.begin(),a.end());
	reverse(b.begin(),b.end());
	int carry=0;
	for(int i=0;i<n2;i++)
	{
		int tmp=(a[i]-'0')-(b[i]-'0')-carry;
		if(tmp<0)
		{
			tmp+=10;
			carry=1;
		}
		else carry=0;
		res.push_back(tmp+'0');
	}
	for(int i=n2;i<n1;i++)
	{
		int tmp=(a[i]-'0')-carry;
		if(tmp<0)
		{
			carry=1;
			tmp+=10;
		}
		else carry=0;
		res.push_back(tmp+'0');
	}
	reverse(res.begin(),res.end());
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
		cout<<find(a,b);
		cout<<endl;
	}
	return 0;
}

