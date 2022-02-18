#include<iostream>
#include<algorithm>
using namespace std;
int n;
struct dta{
	int fi,se;
	//first: thoi gian bat dau
	//second: ket thuc
};
dta h[1005];
bool cmp(dta a,dta b)
{
	return a.se<b.se;
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		cin>>n;
		for(int i=0;i<n;i++)
		{
			cin>>h[i].fi;
		}
		for(int i=0;i<n;i++)
		{
			cin>>h[i].se;
		}
		sort(h,h+n,cmp);
		int d=1,i=0;
		for(int j=1;j<n;j++)
		{
			if(h[j].fi>=h[i].se)
			{
				d++;
				i=j;
			}
		}
		cout<<d<<endl;
	}
	return 0;
}
