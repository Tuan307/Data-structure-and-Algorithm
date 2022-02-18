#include<iostream>
#include<set>
using namespace std;
bool ok=true;
void act(long long a[],long long b[],long long c[],long long n,long long m,long long l)
{
	set<long long> res;
	long long i=0,j=0,k=0;
	while(i<n&&j<m&&k<l)
	{
		if(a[i]==b[j]&&b[j]==c[k])
		{
		    res.insert(a[i]);
		    i++;
		    j++;
		    k++;
		    ok=false;
		}
		else if(a[i]<b[j])
		{
			i++;
		}
		else if(b[j]<c[k])
		{
			j++;
		}
		else k++;
	}
	set<long long>::iterator it;
for( it=res.begin();it!=res.end();it++)
{
cout<<*it<<" ";
}
}
int main()
{
	int t;
	cin>>t;
	while(t--)
{
		long long n,m,l;
		cin>>n>>m>>l;
		long long a[n+1],b[m+1],c[l+1];
		for(long long i=0;i<n;i++)
		{
			cin>>a[i];
		}
		for(long long i=0;i<m;i++)
		{
			cin>>b[i];
		}
		for(long long i=0;i<l;i++)
		{
			cin>>c[i];
		}
		act(a,b,c,n,m,l);
		if(ok) cout<<-1;
		cout<<endl;
		ok=true;
	}
	return 0;
}
