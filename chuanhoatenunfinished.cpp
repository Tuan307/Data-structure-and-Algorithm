#include<bits/stdc++.h>
using namespace std;
void chuanhoa(string a)
{
	int res;
	int res1;
	for(int i=0;a[i]==' ';++i){
		a.erase(i,1);
	}
   if(a[0]==' ')
   {
   	a.erase(0,1);
   }
	for(int i=a.size()-1;;i--)
	{
		if(a[i]==' ')
		{
			res=i;
			break;
		}
	}
	for(int i=res+1;i<a.size();i++)
	{
		if(a[i]>=65&&a[i]<=90)
		{
			a[i]+=32;
		}
		cout<<a[i];
	}
	if(a[0]!=' ')
	{
		if(a[0]>=65&&a[0]<=90)
		{
			a[0]+=32;
		}
		cout<<a[0];
	}
	
	for(int i=0;i<res;i++)
	{
		if()
		if(a[i]>=65&&a[i]<=90)
		{
			a[i]+=32;
		}
		
	}
}
int main()
{
	
	return 0;
}

