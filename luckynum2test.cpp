#include<bits/stdc++.h>
using namespace std;
vector<string> v;
string act(int n)
{
	queue<string> q;
	q.push("6");
	while(n--)
	{
		string s1=q.front();
		q.pop();
		v.push_back(s1);
		string s2=s1;
		q.push(s1.append("6"));
		q.push(s2.append("8"));
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
		for(vector<int>::iterator it =v.begin();it!=v.end();it++)
		{
			cout<<*it<<" ";
		}
	}
	return 0;
}

