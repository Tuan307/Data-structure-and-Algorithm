#include<iostream>
using namespace std;
int n,k;
string s;
bool ok=true;
void in()
{
	for(int i=1;i<=k;i++)
	{
		s[i]='A'+i-1	;
	}
}
void out()
{
	for(int i=1;i<=k;i++)
	{
		cout<<s[i];
	}
	cout<<endl;
}
void act()
{
	int i=k;
	while(i>0&&s[i]==n-k+i-1+'A') i--;
	if(i>0)
	{
		s[i]=s[i]+1;
		for(int j=i+1;j<=k;j++)
		{
			s[j]=s[i]+j-i;
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
	cin>>n>>k;
	in();
	while(ok)
	{
		out();
		act();
	}
	ok=true;
}
	return 0;
}
