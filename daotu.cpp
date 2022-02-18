#include<iostream>
#include<string.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	cin.ignore();
	while(t--)
	{
		string s;
		getline(cin,s);
		int n=s.size()-1;
		for(int i=n;i>=0;i--)
		{
			if(s[i]==' ')
			{
				for(int j=i+1;j<=n;j++)
				{
					cout<<s[j];
				}
				cout<<" ";
				n=i-1;
			}
		}
		for(int i=0;i<=n;i++)
		{
			cout<<s[i];
		}
		cout<<endl;
	}
	return 0;
}
