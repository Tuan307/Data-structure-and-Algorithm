#include <iostream>
#include<algorithm>
using namespace std;

int printDivisors(int n)
{
	int sum=0;
    int i;
    for (i = 1; i * i < n; i++) {
        if (n % i == 0)
            sum+=i;
    }
    if (i - (n / i) == 1) {
        i--;
    }
    for (; i >= 1; i--) {
        if (n % i == 0)
            sum+=n/i;
    }
    return sum;
}
int main()
{
	int n,m;
	cin>>n>>m;
	int res=0;
	for(int i=n;i<=m;i++)
	{
		int sum1=printDivisors(i);
        if(sum1-i>i)
        {
        	res++;
		}
	}
	cout<<res;
}
