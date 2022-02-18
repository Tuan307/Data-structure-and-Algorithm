#include<bits/stdc++.h>
using namespace std;
string act(int n)
{
	queue<string> q;
	q.push("9");
	while(q.size()>0)
	{
	string s1=q.front();
	q.pop();
	long long tmp=0;
	for(int i=0;i<s1.size();i++)
	{
		tmp=tmp*10+(int)(s1[i]-'0');
		tmp%=n;
	}
	if(tmp==0)
	{
		return s1;
	}
	string s2=s1;
	q.push(s1.append("0"));
	q.push(s2.append("9"));
    }
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		cout<<act(n);
		cout<<endl;
	}
	return 0;
}

