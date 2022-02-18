#include<iostream>
#include<deque>
using namespace std;

void printMax(int a[],int n,int k)
{
	deque<int> de;
	while(de.size()) de.pop_front();
	for(int i=1;i<=n;i++)
	{
		while(de.size()&&a[de.back()]<=a[i]) de.pop_back();
		
		de.push_back(i);
		if(de.front() +k<=i) de.pop_front();
		if(i>=k) cout<<a[de.front()]<<" " ;
	}
	
}
int main()
{
	int t;
	cin>>t;
	while(t--){
	int n,k;
	cin>>n>>k;
	int a[n+1];
	for(int i=1;i<=n;i++)
	{
		cin>>a[i];
	}
	printMax(a,n,k);
	cout<<"\n";
}
	return 0;
}
