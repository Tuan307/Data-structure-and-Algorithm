#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	int n;
	cin>>n;
	int m=0;
	int k=0;
	int a[n+1];
	int b[n+1];
	int c[n+1];
	for(int i=1;i<=n;i++)
	{
		cin>>a[i];
		if(i%2==0)
		{
			c[k++]=a[i];
		}
		else
		{
			b[m++]=a[i];
		}
	}
	sort(c,c+k);
	sort(b,b+m);
	for(int i=0;i<m;i++)
	{
		cout<<b[i]<<" "<<c[i]<<" ";
	}
	return 0;
}
