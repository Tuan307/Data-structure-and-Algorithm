#include<bits/stdc++.h>
using namespace std;
const long long p=1e9+7;
int main()
{
	ios_base::sync_with_stdio(0);
    cin.tie(0);
	int t;
	cin>>t;
	while(t--)
	{
       int n;
       cin>>n;
       int a[n+1];
       a[0]=0;
       a[1]=1;
       for(int i=2;i<=n;i++)
       {
       	a[i]=(a[i-1]+a[i-2])%p;
	   }
	   cout<<a[n]<<endl;
	}
	return 0;
}

