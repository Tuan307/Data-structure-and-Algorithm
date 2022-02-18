#include<iostream>
#include<algorithm>
using namespace std;
int x[1000];
int n,k;
void in()
{
	for(int i=1;i<=k;i++)
	{
		cin>>x[i];
	}
}
void out()
{
	for(int i=1;i<=k;i++)
	{
		cout<<x[i]<<" ";
	}
	cout<<endl;
}
void act()
{
	bool ok=false;
	int i=k;
	if(x[k]==k)
	{
		int t=n-k+1;
		for(int j=1;j<=k;j++)
		{
			x[j]=t+j-1;
		}
	}
	else
	{
		while(x[i]-x[i-1]<=1&&i>0)
		{
			if(x[k]==n)
			{
			    i--;
		        x[i]--;
		        ok=true;
	}
	        else
	        {
		        x[i]=n;
		        i--;
		        x[i]--;
		        ok=true;
	        }
	    }
	if(!ok) x[k]--;
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
		act();
		out();
		//cout<<endl;
	}
	return 0;
}
