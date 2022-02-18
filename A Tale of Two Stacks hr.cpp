#include<iostream>
#include<stack>
#include<queue>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		queue<int> q;
		int type;
		cin>>type;
		if(type==1)
		{
			int x;
			cin>>x;
			q.push(x);
		}
		else if(type==2)
		{
			q.pop();
		}
		else if(type==3)
		{
			cout<<q.front()<<endl;
		}
	}
	return 0;
}
