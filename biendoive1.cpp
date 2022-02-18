#include<iostream>
using namespace std;
int getmin(int n ,int*m)
{
	if(n==1)
	return 0;
	if(m[n]!=-1)
	return m[n];
	int res=getmin(n-1,m);
	if(n%2==0)
	{
		res=min(res,getmin(n/2,m));
	}
	if(n%3==0)
	{
		res=min(res,getmin(n/3,m));
	}
	m[n]=1+res;
	return m[n];
}
int getmin(int n)
{
	int m[n+1];
	for(int i=0;i<=n;i++)
	{
		m[i]=-1;
	}
	return getmin(n,m);
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		cout<<getmin(n);
		cout<<endl;
	}
	return 0;
}
