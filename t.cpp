#include<bits/stdc++.h>
using namespace std;
string x;
int n;
bool ok=true;
void in()
{
	for(int i=1;i<=n;i++)
	{
		x[i]='H';
	}
}
void out()
{
	for(int i=1;i<=n;i++)
	{
		cout<<x[i];
	}
	cout<<endl;
}
void sinh()
{
	int i=n;
	while(i>0&&x[i]!='H')
	{
		x[i]='H';
		i--;
	}
	if(i>0) x[i]='A';
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
		bool ok1=false;
		if(x[1]=='H'&&x[n]=='A')
		{
		    for(int i=1;i<=n-1;i++)
	        {
                if(x[i]=='H'&&x[i+1]!='H')
                {
        	        ok1=true;
		        }
		        else if(x[i]=='H'&&x[i+1]=='H')
		        {
			        ok1=false;
			        break;
		        }
	        }
		}
		if(ok1) out();
		sinh();
    }
        ok=true;
        cout<<endl;
    }
	return 0;
}
