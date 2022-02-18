#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n;
	cin>>n;
	deque<int> q;
	while(n--)
	{
		string s;
		cin>>s;
		if(s=="PUSHBACK")
		{
			int k;
			cin>>k;
			q.push_back(k);
		}
		else if(s=="PUSHFRONT")
		{
			int k;
			cin>>k;
			q.push_front(k);
		}
		else if(s=="PRINTFRONT")
		{
			if(q.size()==0) cout<<"NONE"<<endl;
			else
			cout<<q.front()<<endl;
		}
		else if(s=="PRINTBACK")
		{
			if(q.size()==0) cout<<"NONE"<<endl;
			else
			cout<<q.back()<<endl;
		}
		else if(s=="POPFRONT")
		{
			if(q.size()>0)
			{
				q.pop_front();
			}
		}
		else if(s=="POPBACK")
		{
			if(q.size()>0)
			{
				q.pop_back();
			}
		}
		
	}
	return 0;
}

