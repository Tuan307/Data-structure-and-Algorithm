#include<bits/stdc++.h>
using namespace std;
struct cta
{
    int val,pos;	
};
bool compare(cta a,cta b)
{
	if(a.val<b.val) return true;
	if(a.val==b.val&&a.pos<b.pos) return true;
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
		vector<cta> a(n);
		for(int i=0;i<n;i++)
		{
			cin>>a[i].val;
			a[i].pos=i;
		}
		sort(a.begin(),a.end(),compare);
		int count=0;
		for(int i=0;i<n;i++)
		{
			while(a[i].pos!=i)
			{
				swap(a[i],a[a[i].pos]);
				count++;
			}
		}
		cout<<count<<endl;
	}
	return 0;
}

