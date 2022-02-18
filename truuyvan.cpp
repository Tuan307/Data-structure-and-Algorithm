#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n,q;
		cin>>n>>q;
		int a[n+1],b[q+1];
		for(int i=0;i<n;i++)
		{
			cin>>a[i];
		}
		for(int i=0;i<q;i++)
		{
			cin>>b[i];
		}
		int count;
		int res=0;
		int m=0;
		int c[100];
		for(int i=0;i<n;i++)
		{
			if(i>q-1) break;
			count=0;
			res=0;
			for(int j=b[i]+1;j<n;j++)
			{
				count=0;
				res=0;
				for(int k=j;k<n;k++)
				{
				//if(i>q) break;
				if(a[k]>a[j])
				{
					count++;
					a[j]=a[k];
				}
			}
				res=max(count,res);
			}
			c[m++]=res;
			//cout<<" ";
		}
		for(int i=0;i<m;i++)
		{
			cout<<c[i]<<" ";
		}
		cout<<endl;
	}
	return 0;
}
