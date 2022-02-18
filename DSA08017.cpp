#include<bits/stdc++.h>
using namespace std;
string v="";
void act(int n)
{
	queue<long> q;
	q.push(6);
	while(true)
	{
			int c=0;
		long s1=q.front();
		q.pop();
		cout<<s1<<" ";
		if(c==1) break;
		long s2=s1;
		q.push(s1*10+6);
		q.push(s2*10+8);
		if(s2>=pow(10,n-1))
		{
			c=1;
		}
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
		act(n);
		cout<<endl;
	}
	return 0;
}

