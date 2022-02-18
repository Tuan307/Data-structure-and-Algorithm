#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int v,e;
		cin>>v>>e;
		vector<int> a[v+4];//mang luu tru(giong mang 2 chieu)
		for(int i=0;i<e;i++)
		{
			int c,d;
			cin>>c>>d;
			a[c].push_back(d);
		}
		for(int i=1;i<=v;i++)
		{
			sort(a[i].begin(),a[i].end());
		}
		for(int i=1;i<=v;i++)
		{
			cout<<i<<": ";
			for(int j=0;j<a[i].size();j++)
			{
				cout<<a[i][j]<<" ";
			}
			cout<<endl;
		}
		cout<<endl;
	}
	return 0;
}

