#include<iostream>
using namespace std;
int n;
int a[100];
int m;
bool ok=true;
void in()
{
	for(int i=1;i<=m;i++)
	{
		a[i]=6;
	}
}
void out()
{
	for(int i=1;i<=m;i++)
	{
		cout<<a[i];
	}
	cout<<" ";
}
void act()
{
	int i=n;
	while(i>0&&a[i]!=6)
	{
		
		i--;
	}
	a[i]=8;
	if(i>0)
	{
		for(int j=i+1;j<=m;j++)
		{
			a[j]=6;
		}
	}
	else ok=false;
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		cin>>n;
		m=1;
		int count=pow(2,n);
		cout<<count<<endl;
		while(m<=n)
		{
		in();
		while(ok)
		{
			if(m==n)
			{
			out();
		    }
			act();
		}
		cout<<" ";
		ok=true;
		m++;
	}
	cout<<endl;
	}
	
	return 0;
}

