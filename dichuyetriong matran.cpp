#include<iostream>
using namespace std;
int n,m,a[100][100];
int count;
void in()
{
	cin>>n>>m;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=m;j++)
		{
			cin>>a[i][j];
		}
	}
}
int Try(int n,int m)
{
	if(m==1||n==1)
	{
		return 1;
	}
	return Try(m-1,n)+Try(m,n-1);
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		in();
		cout<<Try(n,m);	
		cout<<endl;
	}
	return 0;
}
