#include<iostream>
#include<algorithm>
using namespace std;
int gcd_(int a,int b)
{
	if(b==0) return a;
	else
	{
		int k=a%b;
		return gcd_(b,k);
	}
}
int main()
{
	int a=357;
	int b=234;
	cout<<gcd_(a,b);
}
