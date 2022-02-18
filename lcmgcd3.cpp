#include<bits/stdc++.h>
using namespace std;
#define modulo 1000000007
int a[10000];
int ucln(int x,int y)
{
	int tmp;
	while(x!=0)
	{
		tmp=x;
		x=y%x;
		y=tmp;
	}
	return y;
}
int main()
{
	int t,size,i,gcd,j;
	long long p;
	cin>>t;
	while(t--)
	{
		cin>>size;
		for(i=0;i<size;i++)
		{
			cin>>a[i];
		}
			gcd=ucln(a[0],a[0]);
		for(i=1;i<size;i++)
		{
			gcd=ucln(gcd,a[i]);
		}
		p=1;
		for(i=0;i<size;i++)
		{
			for(j=0;j<gcd;j++)
			{
				p=(p*a[i])%modulo;
			}
		}
		cout<<p<<endl;
	}
	return 0;
}

