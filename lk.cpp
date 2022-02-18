#include<bits/stdc++.h>
using namespace std;
int n,a[100];
bool ok=true;
void in()
{
	cin>>n;
	for(int i=1;i<=n;i++)
	{
		a[i]=0;
	}
}
void result()
{
	for(int i=1;i<=n;i++)
	{
		cout<<a[i];
	}
	cout<<endl;
}
void combi()
{
	int i=n;
	while(i>0&&a[i]!=0)
	{
		a[i]=0;
		i--;
	}
	if(i>0)
	{
		a[i]=1;
	}
	else ok=false;
}
int main()
{
	in();
	while(ok)
	{
	result();
	combi();
}
	return 0;
}

