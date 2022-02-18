/*
idea: ex input:1234
tach 1234 ra dua vao vector as cac day con dau tien : 1 2 3 4
sau do 1 12 123 1234
       2 23 234
       3...
       
*/
#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		long long n;
		cin>>n;
		vector<int> a;
		while(n)
		{
			a.push_back(n%10);
			n/=10;
		}
		reverse(a.begin(),a.end());
		long long sum=0;
		for(int i=0;i<a.size();i++)
		{
			long long tmp=0;
			for(int j=i;j<a.size();j++)
			{
				tmp=tmp*10+a[j];
				sum+=tmp;
			}
		}
		cout<<sum<<endl;
	}
	return 0;
}
