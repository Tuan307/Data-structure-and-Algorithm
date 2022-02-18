#include<iostream>
using namespace std;
int n;
int a[1000];
void out()
{
	int check=1;
	for(int i=1;i<=n-1;i++)
	{
		if((a[i]==1&&a[i+1]==1)||(a[i]==0&&a[i+1]==0))
		{
			check=0;
			break;
		}
	}
	if(check==1)
	{
		for(int i=1;i<=n;i++)
		{
			cout<<a[i]<<" ";
		}
		cout<<endl;
	}
}
void back_track(int i)
{
	for(int j=0;j<=1;j++)
	{
		a[i]=j;
		if(i==n) out();
		else back_track(i+1);
	}
}
int main()
{
		cin>>n;
		back_track(1);
	return 0;
}
