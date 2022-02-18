#include<bits/stdc++.h>
using namespace std;
int a[100],n;
bool ok=true;
void in()
{
	for(int i=1;i<=n;i++)
	{
		a[i]=i;;
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
void combi()
{
	int i=n-1;
	while(i>0&&a[i]>a[i+1]) i--;
	if(i>0)
	{
		int k=n;
		while(k>0&&a[i]>a[k])
		{
			k--;
		}
		swap(a[i],a[k]);
		int r=i+1,s=n;
		while(r<=s)
		{
			swap(a[r],a[s]);
			r++;
			s--;
		}
	}
	else
	{
		ok=false;
	}
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
		combi();
}
		cout<<endl;
		ok=true;
	}
	
	return 0;
}

