#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
        long long n;
        cin>>n;
        long long a[n+1];
        long long b[n+1];
        for(int i=0;i<n;i++)
        {
        	cin>>a[i];
		    b[i]=-1;
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		    	if(a[j]==i)
		    	{
		    		b[i]=a[j];
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			cout<<b[i]<<" ";
		}
		cout<<endl;
	}
	return 0;
}

