#include<iostream>
#include<algorithm>
#include<queue>
#include<vector>
using namespace std;
int main()
{
	int t;
	cin>>t;
	cin.ignore();
	while(t--)
	{
		int k;
		cin>>k;
		string s;
		cin>>s;
		long long d[100000]={0};
		for(int i=0;i<s.size();i++)
		{
			d[s[i]-'0']++;
		}
		priority_queue<long long, vector<long long> > q;
		for(int i=0;i<500;i++)
		{
			if(d[i]!=0)
			{
				q.push(d[i]);
			}
		}
		while(k>0)
		{
			k--;
			int tmp=q.top();
			q.pop();
			tmp--;
			q.push(tmp);
		}
		long long res=0;
		while(q.size()>0)
		{
			int t=q.top();
			q.pop();
			res+=t*t;
		}
		cout<<res<<endl;
	}
	return 0;
}
