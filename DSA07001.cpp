#include<bits/stdc++.h>
using namespace std;
int main()
{
	stack<int> q;
	string s;
	while(cin>>s)
	{
		if(s=="push")
		{
			int k;
			cin>>k;
			q.push(k);
		}
		else if(s=="pop")
		{
			q.pop();
		}
		else if(s=="show")
		{
			if(q.size()==0)
			{
				cout<<"empty"<<endl;
			}
			else 
			{
				vector<int> v;
				while(!q.empty())
				{
					v.push_back(q.top());
					q.pop();
				}
				reverse(v.begin(),v.end());
				for(int i=0;i<v.size();i++)
				{
					cout<<v[i]<<" ";
					q.push(v[i]);
				}
				cout<<endl;
			}
		}
	}
	return 0;
}

