#include<bits/stdc++.h>
using namespace std;
int a[20][20];
string kq,n;
bool kt;
void in(int m)
{
	for(int i=0;i<m;i++)
	{
		cout<<kq[i];
	}
	cout<<" ";
}
void dequy(int i,int j,int m)
{
	if(i==n&&j==n)
	{
		kt=false;
		in(m);
		return;
	}
	if(a[i+1][j]==1)
	{
		kq[m]='D';
		dequy(i+1,j,m+1);
	}
	if(a[i][j+1]==1)
	{
		kq[m]='R';
		dequy(i,j+1,m+1);
	}
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		cin>>n;
		kq="";
		kt=false;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				cin>>a[i][j];
			}
		}
		if(a[1][1]==0)
		{
			cout<<"-1";
		}
		dequy(1,1,0);
		if(kt==0)
		{
			cout<<"-1";
		}
		cout<<endl;
	}
	return 0;
}

