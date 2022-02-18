#include<bits/stdc++.h>
using namespace std;
bool isprime(int x)
{
	if(x<2) return false;
	for(int i=2;i<=sqrt(x);i++)
	{
		if(x%i==0)
		{
			return false;
		}
	}
	return true;
}
int main()
{
	int n;
	cin>>n;
	for(int i=2;i<=n;i++)
	{
		if(isprime(i))
		cout<<i<<" ";
	}
	cout<<endl;
	cout<<endl;
	cout<<"---HAPPY NEW YEAR-2021---";
	return 0;
}

