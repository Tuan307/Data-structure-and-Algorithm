#include<iostream>
using namespace std;
int a[100],b[100],c[100],n;
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
		cout<<c[i];
	}
	cout<<" ";
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
		cin>>n;
		in();
		while(ok)
		{
			for(int i=1;i<=n;i++)
			{
				b[i]=a[i];
				c[i]=b[i];
			}
			for(int i=1;i<=n;i++)
			{
				 if(b[i]==1)
				{
					if(b[i+1]==1)
					{
						c[i+1]=0;
					}
					else c[i+1]=1;
				}
			}
			out();
			act();
		}
		cout<<endl;
		ok=true;
	}
	return 0;
}

