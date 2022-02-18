#include<bits/stdc++.h>
using namespace std;
int n,k,a[100];
bool ok=true;
void act()
{
	int i=k;
	while(i>0&&a[i]==n-k+i) i--;
	a[i]=a[i]+1;
	if(i>0)
	{
		for(int j=i+1;j<=n;j++)
		{
			a[j]=a[i]+j-i;
		}
	}
	else ok=false;
}
void out()
{
	for(int i=1;i<=k;i++)
	{
		cout<<a[i];
	}
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		cin>>n>>k;
		int b[100];
		int count1=0;
		for(int i=1;i<=k;i++)
		{
			cin>>a[i];
			b[i]=a[i];
			count1++;
		}
		act();
		if(ok)
		{
			bool ok1;
			int count=0;
		for(int i=1;i<=k;i++)
		{
			ok1=false;
			for(int j=1;j<=k;j++)
			{
			    if(b[i]!=a[j])
			    {
				    ok1=true;
			    }
			    else
				{ 
				ok1=false;
				break;
			    }
		    }
		    if(ok1) count++;
		}
		cout<<count;
	    }
	    else cout<<count1;
		cout<<endl;
		ok=true;
	}
	return 0;
}

