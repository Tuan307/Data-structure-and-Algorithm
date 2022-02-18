#include<bits/stdc++.h>
using namespace std;
int a[100],n,k;
bool ok=true;
void in()
{
	for(int i=1;i<=k;i++)
	{
		cin>>a[i];
	}
}
void out()
{
	for(int i=1;i<=k;i++)
	{
		cout<<a[i]<<" ";
	}
	cout<<" ";
}
void combi()
{
	int i=k;
	while(i>0&&a[i]==n-k+i) i--;
	a[i]++;
	if(i>0)
	{
		for(int j=i+1;j<=n;j++)
		{
			a[j]=a[i]+j-i;
		}
	}
	else
	{
		ok=false;
		for(int i=1;i<=k;i++)
		{
			a[i]=i;
		}
	}
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		cin>>n>>k;
		in();
		if(ok)
		{
		combi();
		out();
	    }
		else
		{
		combi();
		out();
		}
		ok=true;
		cout<<endl;
	}
	return 0;
}

