#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t,n;
	cin>>t;
	while(t--)
	{
		cin>>n;
		int sum=1;
	for(int j=0;j<n;j++)
	{
		if(j%2==0)
		{
			sum=sum*2;
		}
		else 
		{
			sum=sum+1;
		}
	}
		cout<<sum<<endl;
}

	return 0;
}

