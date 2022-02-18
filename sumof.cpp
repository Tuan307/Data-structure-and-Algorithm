#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	long long n;
	cin>>n;
	long long a[n+1];
	for(long long i=0;i<n;i++)
	{
		cin>>a[i];
	}
	sort(a,a+n);
	long long res1=a[0]*a[1];
	long long res2=a[0]*a[1]*a[2];
	long long res3=max(res1,res2);
	long long res7=a[0]*a[1]*a[n-1];
	long long res8=a[0]*a[n-1]*a[n-2];
	long long res9=max(res7,res8);
	long long res10=max(res9,res3);
	long long res4=a[n-1]*a[n-2];
	long long res5=a[n-2]*a[n-1]*a[n-3];
	long long res6=max(res4,res5);
	long long result=max(res10,res6);
	cout<<result;
	return 0;
}
