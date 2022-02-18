#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int k;
		cin>>k;
		string s;
		cin>>s;
		int i=0;
		while(k--)
		{
			int j=s.size()-i-1;
		    while(i>=0&&(s[i]-'0')>=(s[j]-'0')&&i!=j) j--;
			swap(s[i],s[j]);
			i++;
		}
	cout<<s;
		cout<<endl;
	}
	return 0;
}

