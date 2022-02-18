#include<iostream>
using namespace std;
int n;
int a[100];
bool ok=true;
void in()
{
	for(int i=1;i<=n;i++)
	{
		a[i]=8;
	}
}
void out()
{
	for(int i=1;i<=n;i++)
	{
		cout<<a[i];
	}
	cout<<" ";
}
void act()
{
	int i=n;
	while(i>0&&a[i]!=8)
	{
		
		i--;
	}
	a[i]=6;
	if(i>0)
	{
		for(int j=i+1;j<=n;j++)
		{
			a[j]=8;
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
		while(n>0)
		{
		in();
		while(ok)
		{
			out();
			act();
		}
		cout<<" ";
		ok=true;
		n--;
	}
	cout<<endl;
	}
	
	return 0;
}

