#include<bits/stdc++.h>
using namespace std;
void check(int s,int d)
{
	if(s>9*d)
	{
		cout<<"-1";
		return;
	}
	int res[d];
	s-=1;
	for(int i=d-1;i>=0;i--)
	{
		if(s>9)
		{
			res[i]=9;
			s-=9;
		}
		else
		{
			res[i]=s;
			s=0;
		}
	}
	res[0]=s+1;
	for (int i=0; i<d; i++)
        cout << res[i];
}
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n,d;
		cin>>n>>d;
	    check(n,d);
		cout<<endl;
	}
	return 0;
}
