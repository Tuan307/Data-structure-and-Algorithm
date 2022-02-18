#include<iostream>
using namespace std;
long long mul(long long a)
{
	return a*a;
}
long long pow(long long k)
{
	if(k==0) return 1;
    else
	{ 
    if(k%2==0)
    {
    	return mul(pow(k/2));
	}
	else
	{
		return 2*(mul(pow(k/2)));
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
		long long k;
		cin>>n>>k;
		long long p=pow(n)/2;//2^n-1
		while(1)
		{
			if(n==1)
			{
				cout<<1;
				break;
			}
			if(p==k)
			{
				cout<<n;
				break;
			}
			if(k>p)
			{
				k=p-(k-p);
			}
			n--;
			p/=2;
		}
		cout<<endl;
	}
	return 0;
}
