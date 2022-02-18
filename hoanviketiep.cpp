#include<bits/stdc++.h>
using namespace std;
int a[100],n;
bool ok=true;
void in()
{
	for(int i=1;i<=n;i++)
	{
		cin>>a[i];
	}
}
void out()
{
	for(int i=1;i<=n;i++)
	{
		cout<<a[i]<<" ";
	}
}
void combi()
{
	int i=n-1;
	while(i>0&&a[i]>a[i+1]) i--;
	if(i>0)
	{
		int k=n;
		while(a[i]>a[k]) k--;
		swap(a[i],a[k]);
		int j=i+1;
		int s=n;
		while(j<=s)
		{
			swap(a[j],a[s]);
			s--;
			j++;
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
		in();
		combi();
		if(ok)
		{
			out();
		}
		else
		{
			for(int i=1;i<=n;i++)
			{
				cout<<i<<" ";
			}
		}
		cout<<endl;
	}
	return 0;
}

