#include<iostream>
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
	int t;
	cin>>t;
	while(t--)
	{
	    cin>>n;
	    in();
	    while(ok)
	    {
	        act();
	        int count=0;
	        for(int i=1;i<=n;i++)
	        {
		        if(s[i]==1) count++;
	        }
	    if(count<=1)
	    {
	    	out();
		}
	}
	    ok=true;
		cout<<endl;
    }
	return 0;
}


