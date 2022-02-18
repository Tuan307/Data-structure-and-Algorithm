#include<bits/stdc++.h>
using namespace std;
int main()
{
	stack<int> q;
	int n;
	cin>>n;
	while(n--)
	{
		string s;
		cin>>s;
		if(s=="PUSH")
		{
			int k;
			cin>>k;
			q.push(k);
		}
		else if(s=="POP"&&q.size()>0)
		{
			q.pop();
		}
		else if(s=="PRINT")
		{
			if(q.size()==0)
			{
				cout<<"NONE"<<endl;
			}
			else 
			{
				cout<<q.top();
				cout<<endl;
			}
		}
	}
	return 0;
}

