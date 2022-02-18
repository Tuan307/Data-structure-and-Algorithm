#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		char c[1001];
	    for(int i=1;i<=n;i++)
	    {
			itoa(i,c,2);
			cout<<c<<" ";
		}
		cout<<endl;
    }
	return 0;
}

