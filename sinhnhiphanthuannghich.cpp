#include<bits/stdc++.h>
using namespace std;
bool ok=true;
int n;
int s[100];
void in()
{
	   for(int i=1;i<=n;i++)
	{
		s[i]=0;
	}
}
bool check()
{
	for(int i=1;i<=n/2;i++)
	{
		if(s[i]!=s[n-i+1])
		{
			return false;
		}
	}
	return true;
}
void act()
{
	int i=n;
	while(i>0&&s[i]!=0)
	{
		s[i]=0;
		i--;
	}
	if(i>0) s[i]=1;
	else ok=false;
}
void out()
{
	for(int i=1;i<=n;i++)
	{
		cout<<s[i]<<" ";
	}
	cout<<endl;
}
int main()
{
	    cin>>n;
	    in();
	    while(ok)
	    {
	    	if(check())
	    	{
	        out();
	    }
	        act();
	    }
	    //ok=true;
	return 0;
}


