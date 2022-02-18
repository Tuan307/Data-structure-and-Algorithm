#include<iostream>
#include<queue>
using namespace std;
const long long mod=1e9+7;
int main()
{
	int t;
	cin>>t;
	while(t--){
		long long n;
		long long val;
		priority_queue<long long,vector<long long>,greater<long long> > a;
		cin>>n;
		for(long long i=0;i<n;i++)
		{
			
			cin>>val;
			a.push(val);
		}
		long long sum=0;
		while(a.size()>1)
		{
			long long x=a.top();
			a.pop();
			long long y=a.top();
			a.pop();
			long long tmp=(x+y)%mod;
			a.push(tmp);
			sum+=tmp;
			sum=sum%mod;
		}
		cout<<sum%mod<<endl;
	}
	return 0;
}
