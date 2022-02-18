#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	long long a,n;
	cin>>n;
    for(int i=2;i<=sqrt(n);)
    {
    	if(n%i==0)
    	{
    	  n/=i;
		  a=i;	
		}
		else i++;
	}
	if(n>1) cout<<n;
	else cout<<a;
	cout<<endl;
}
return 0;
}
