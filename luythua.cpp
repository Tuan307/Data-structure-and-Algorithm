#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
long long sqr(long long x)
{
	return x*x;
}
long long pow(long long a,long long b,long long m)
{
	if(b==0) return 1;
	else
	{
		if(b%2==0)
		{
			return sqr(pow(a,b/2,m))%m;
		}
		else
		{
			return a*(sqr(pow(a,b/2,m))%m)%m;
		}
	}
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
    	long long a,b,c,d,m;
    	cin>>a>>b>>c>>d>>m;
    	long long ans1=pow(c,d,m)%m;
    	long long ans2=b*ans1;
    	cout<<pow(a,ans2,m)%m;
    	cout<<endl;
	}
	return 0;
}
