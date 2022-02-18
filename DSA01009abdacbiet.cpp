#include<bits/stdc++.h>
using namespace std;
string x;
int n;
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
	cout<<endl;
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
	cin>>n;
	int k;
	cin>>k;
	in();
	vector<string> v;
	int count1=0;
	while(ok)
	{
		bool ok1=false;
		int count;
		string tmp="";
	for(int i=1;i<=n;i++)
	{
        count=0;
		for(int j=i;j<=n;j++)
		{
		    if(x[j]=='A')
		    {
			    count++;
		    }
		    else
		    {
			    break;
			}    
        }
        if(count>k) break;
        else if(count==k)
		{
		  ok1=true;
		  count1++;
		  for(int k=1;k<=n;k++)
		  {
		  	tmp+=x[k];
		  }
		  v.push_back(tmp);
		  break;
	    }
	}

		sinh();
}
cout<<count1<<endl;
for(int i=0;i<v.size();i++)
{
	cout<<v[i]<<endl;
}
	return 0;
}
