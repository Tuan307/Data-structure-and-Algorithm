#include<bits/stdc++.h>

using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n,m;
		cin>>n>>m;
		int a[n+1],b[m+1],c[m+n],d[m+n];
		for(int i=0;i<n;i++)
		{
			cin>>a[i];
			c[i]=a[i];
		}
		sort(a,a+n);
		for(int i=0;i<m;i++)
		{
			cin>>b[i];
			c[n+i]=b[i];
		}
		sort(b,b+n);
		int k=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(b[i]==a[j])
				{
					d[k]=b[i];
					k++;
					break;
				}
			}
		}
		sort(c,c+m+n);
		set<int> res;
		for(int i=0;i<m+n;i++)
		{
			res.insert(c[i]);
		}
		for (set<int>:: iterator it = res.begin(); it != res.end(); it++){
		cout<< *it << " ";
	}
	cout<<endl;
	    for(int i=0;i<k;i++)
	    {
	    	cout<<d[i]<<" ";
		}
	cout<<endl;
	}
	return 0;
}
