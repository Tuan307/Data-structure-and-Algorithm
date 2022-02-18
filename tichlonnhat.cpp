#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	int n;
	cin>>n;
	int a[n+1];
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
	}
	sort(a,a+n);
	int ans1=a[0]*a[1];
	int ans2=a[0]*a[1]*a[2];
	int ans3=max(ans1,ans2);
	int ans4=a[n-1]*a[n-2];
	int ans5=a[n-2]*a[n-1]*a[n-3];
	int ans6=max(ans4,ans5);
	int ans7=max(ans3,ans6);
	cout<<ans7;
	return 0;
}
