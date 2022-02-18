#include<bits/stdc++.h>
using namespace std;
int n;
int a[100];
bool ok=true;
void in()
{
	for(int i=1;i<=n;i++)
	{
		a[i]=0;
	}
}
void out()
{
	for(int i=1;i<=n;i++)
	{
		cout<<a[i];
	}
	cout<<endl;
}
void act()
{
	int i=n;
	while(i>0&&a[i]!=0)
	{
		a[i]=0;
		i--;
	}
	if(i>0) a[i]=1;
	else ok=false;
}

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int k;
		cin>>n>>k;
		in();
		while(ok)
		{
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(a[i]==1)
				{
					count++;
				}
			}
			if(count==k) out();
			act();
	    }
	    cout<<endl;
	    ok=true;
	}
	return 0;
}

