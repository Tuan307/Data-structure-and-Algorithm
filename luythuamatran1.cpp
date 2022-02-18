#include<iostream>
#include<vector>
using namespace std;
#define matrix vector<vector< long long > >
const long long mod=1e9+7;	
matrix MaxPow(matrix &mt,long long n)
{
	if(n%2==0&&n>2) return (MaxPow(MaxPow(mt,n/2),2))%mod;
	else if(n%2!=0&&n>2) return ((MaxPow(MaxPow(mt,n/2),2)%mod)*mt)%mod;;
	else if(n==2) return (mt*mt)%mod;
	else return mt%mod;
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		long long n,k;
		cin>>n>>k;
		long long a[n+1][n+1];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				cin>>a[i][j];
			}
		}
		cout<<MaxPow(a,n);
		cout<<endl;
	}
	return 0;
}
