#include<bits/stdc++.h>
using namespace std;
bool a[22],b[22],xuoi[22],nguoc[22];
int res=0,n;
void Try(int i)
{
	for(int j=1;j<=n;j++)
	{
		if(!b[j] && !a[j] && !xuoi[i-j+n] && !nguoc[i+j-1])
		{
			a[j]=true;
			xuoi[i-j+n]=true;
			nguoc[i+j-1]=true;
			if(i==n) res++;
			else Try(i+1);
			a[j]=false;
			b[j]=false;
			xuoi[i-j+n]=false;
			nguoc[i+j-1]=false;
		}
	}
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		res=0;
		cin>>n;
		Try(1);
		cout<<res<<endl;
	}
	return 0;
}

