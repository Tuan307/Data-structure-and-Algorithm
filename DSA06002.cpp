#include<bits/stdc++.h>
using namespace std;
struct dta
{
   int count,val;	
};
bool compare(dta a,dta b)
{
	if(a.count>b.count) return true;
	 if((a.count==b.count)&&a.val<b.val) return true;
	return false;
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		vector<dta> a(n);
		int d[100001]={0};
		for(int i=0;i<n;i++)
		{
			cin>>a[i].val;
			d[a[i].val]++;
		}
		for(int i=0;i<n;i++)
		{
			a[i].count=d[a[i].val];
		}
		sort(a.begin(),a.end(),compare);
		for(int i=0;i<n;i++)
		{
			cout<<a[i].val<<" ";
		}
		cout<<endl;
	}
	return 0;
}

