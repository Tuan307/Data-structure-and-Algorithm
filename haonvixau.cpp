#include<bits/stdc++.h>
using namespace std;
string a;
bool ok=true;
void out()
{
	for(int i=0;i<a.size();i++)
	{
		cout<<a[i];
	}
}
void combi()
{
	int i=a.size()-2;
	while(i>=0&&(a[i])>=(a[i+1])) i--;
	if(i>=0)
	{
		int k=a.size()-1;
		while(a[i]>=a[k]) k--;
		swap(a[i],a[k]);
		int j=i+1;
		int s=a.size()-1;
		while(j<=s)
		{
			swap(a[j],a[s]);
			s--;
			j++;
		}
	}
	else ok=false;
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		cin>>a;
		combi();
		if(ok)
		{
			cout<<n<<" ";
			out();
		}
		else
		{
			cout<<n<<" "<<"BIGGEST";
		}
		ok=true;
		cout<<endl;
	}
	return 0;
}
