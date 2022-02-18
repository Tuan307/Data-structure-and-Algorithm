#include<iostream>
#include<string>
using namespace std;
void process(string a)
{
	int res;
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
		cout<<a[i];
	}
	if(a[0]!=' ')
	{
		cout<<a[0];
	}
	for(int i=0;i<res;i++)
	{
		if(a[i]==' '&&a[i+1]!=' ')
	{
		cout<<a[i+1];
	}
	}
	cout<<"@ptit.edu.vn";
}
int main()
{
		string a;
	    getline(cin,a);
        for(int i=0;i<a.size();i++)
	{
		if(a[i]>=65&&a[i]<=90)
		{
			a[i]+=32;
		}
	}
        process(a);
        cout<<endl;
	return 0;
}

