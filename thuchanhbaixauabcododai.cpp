#include<bits/stdc++.h>
using namespace std;
int n;
string x;
bool ok=true;
void in()
{
	for(int i=1;i<=n;i++)
	{
		x[i]='A';
	}
}
void out()
{
	for(int i=1;i<=n;i++)
	{
		cout<<x[i];
	}
	cout<<" ";
}
void sinh()
{
	int i=n;
	while(i>0&&x[i]!='A')
	{
		x[i]='A';
		i--;
	}
	if(i>0) x[i]='B';
	else ok=false;
}

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		cin>>n;
		in();
		while(ok)
		{
			out();
			sinh();
		}
		cout<<endl;
		ok=true;
	}
	return 0;
}

