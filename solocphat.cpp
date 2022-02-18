#include<bits/stdc++.h>
using namespace std;
bool isright(long long n)
{
	while(n!=0)
	{
		int t =n%10;
		if(t!=6&&t!=8)
		{
			return false;
		}
		n/=10;
	}
	return true;
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		queue<long long> q;
		int n;
		cin>>n;
		int count=0;
		for(int i=6;i<=pow(10,n)-1;i++)
		{
			if(isright(i))
			{
				count++;
				q.push(i);
			}
		}
		cout<<count<<endl;
		while(!q.empty())
		{
			cout<<q.front()<<" ";
			q.pop();
		}
		cout<<endl;
	}
	return 0;
}

