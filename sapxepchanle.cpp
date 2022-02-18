#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	int n;
	cin>>n;
	int a[n+5],b[n+5],c[n+5];
	int m=0,k=0;
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
	}
	for(int i=0;i<n;i++)
	{
		if(i%2!=0)
		{
			b[m++]=a[i];
		}
		else c[k++]=a[i];
	}
	sort(b,b+m);
	sort(c,c+k);
	for(int i=0;i<n;i++)
	{
		if(i<k){
			cout<<c[i]<<" ";
		}
		if(i<m)
		{
			cout<<b[m-1-i]<<" ";
		}
		if(i>=m&&i>=n) break;
	}
	return 0;
}
