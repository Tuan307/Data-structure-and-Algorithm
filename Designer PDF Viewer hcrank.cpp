#include<bits/stdc++.h>
using namespace std;
int main()
{
	int a[27];
	for(int i=0;i<26;i++)
	{
		cin>>a[i];
	}
	char word[100];
	cin>>word;
	int n=0;
	int m=0;
	for(int i=0;word[i];i++)
	{
		n++;
		m=max(m,a[word[i]-'a']);
	}
	cout<<n*m;
	return 0;
}

