#include<iostream>
using namespace std;
int main()
{
	int n;
	cin>>n;
	for(int i=1;i<=n/2;i++)
	{
		cout<<0<<" "<<1<<" ";
	}
	if(n%2!=0)
	{
		cout<<0;
	}
	cout<<endl;
	for(int i=1;i<=n/2;i++)
	{
		cout<<1<<" "<<0<<" ";
	}
	if(n%2!=0)
	{
		cout<<1;
	}
	return 0;
}


