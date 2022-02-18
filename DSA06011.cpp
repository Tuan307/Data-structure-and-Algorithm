#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		int a[n+1];
		int k;
		for(int i=0;i<n;i++)
		{
			cin>>a[i];
		}
		int min=(a[0]+a[1]);
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			 k=abs(a[i]+a[j]);
            if(k<abs(min))
            {
            	min=a[i]+a[j];
			}
			}
		}
		cout<<min<<endl;
	}
	return 0;
}

