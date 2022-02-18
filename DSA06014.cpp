	#include<bits/stdc++.h>
	using namespace std;
	bool isprime(int n)
	{
		if(n<=1) return false;
		for(int i=2;i<=sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	int main()
	{
		int t;
		cin>>t;
		while(t--)
		{
			int n;
			cin>>n;
			bool ok=true;
			for(int i=2;i<=n;i++)
			{
				if(isprime(i))
			{
			
						if(isprime(n-i))
						{
							
						
					ok=false;
					cout<<i<<" "<<n-i;
					break;
				}
				}
					
			}
			if(ok==true) cout<<"-1";
			cout<<endl;
		}
		return 0;
	}

