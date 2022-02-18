#include<iostream>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		string s1;
		cin>>s1;
		string s2;
		cin>>s2;
		int res1=0;
		int res2=0;
		int k=0;
		int j=0;
		for(int i=s1.size()-1;i>=0;i--)
		{
			res1+=(int)(s1[i]-'0')*(pow(2,j));
			j++;
		}
			for(int i=s2.size()-1;i>=0;i--)
		{
			res2+=(int)(s2[i]-'0')*(pow(2,k));
			k++;
		}
		cout<<res1*res2<<endl;
	}
	return 0;
}
