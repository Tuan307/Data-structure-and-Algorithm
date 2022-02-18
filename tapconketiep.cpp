#include<bits/stdc++.h>
using namespace std;
int a[100];
bool ok=true;
int n,k;
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
		cout<<a[i];
	}
	cout<<" ";
}
void combi()
{
	int i=k;
	while(i>0&&a[i]==n-k+i)
	{
		i--;
	}
	a[i]=a[i]+1;
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
			cout<<i<<" ";
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
		combi();
		if(ok) out();
	    ok=true;
		cout<<endl;
	}
	return 0;
}

