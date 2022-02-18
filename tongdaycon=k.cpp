#include<bits/stdc++.h>
using namespace std;
int a[20],b[20],n,k,kt,count=0;
void xuly()
{
	count++;
	int t=0,i,c[20],m=0;
	for(i=1;i<=n;i++)
	{
		t+=a[i]*b[i];
	}
	if(t==k)
	{ 
	    kt=1;
	    for(int i=1;i<=n;i++)
	    {
	    	if(b[i]) c[m++]=a[i];
		}
		for(int i=0;i<m-1;i++)
		{
			cout<<c[i]<<" ";
		}
		cout<<c[m-1]<<endl;
	}
}
void Try(int i)
{
	int j;
	//int count=0;
	for(j=1;j>=0;j--)
	{
		b[i]=j;
		if(i==n)
		{
		xuly();
	}
		else Try(i+1);
	}
}
int main()
{
		cin>>n>>k;
			kt=0;
		for(int i=1;i<=n;i++)
		{
			cin>>a[i];
		}
		sort(a+1,a+n+1);
		Try(1);
		cout<<count;
		if(kt!=1) cout<<"-1";
		//cout<<endl;
	return 0;
}

