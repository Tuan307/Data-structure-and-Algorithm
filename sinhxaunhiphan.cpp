#include<iostream>
using namespace std;
int a[100];
int n,k;
void xuat()
{
	for(int i=1;i<=n;i++)
	{
		cout<<a[i];
	}
	cout<<" ";
}
void sinh(int i)
{
	int count=0;
	for(int j=0;j<=1;j++)
	{
		a[i]=j;
		if(i==n) xuat();
		else sinh(i+1);
	}
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
        cin>>n>>k;
        sinh(1);
        cout<<endl;
	}
	return 0;
}

