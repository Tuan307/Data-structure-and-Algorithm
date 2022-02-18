#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n;
	cin>>n;
	queue<int> q;
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
		else if(s=="POP")
		{
			if(q.size()>0)
			{
				q.pop();
			}
			else continue;
		}
		else if(s=="PRINTFRONT")
		{
			if(q.size()==0)
			{
				cout<<"NONE"<<endl;
			}
			else
			{
				cout<<q.front()<<endl;
				//q.pop();
			}
		}
	}
	return 0;
}

