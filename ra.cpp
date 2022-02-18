#include<bits/stdc++.h>
using namespace std;
string fibo( int n)
{
    if (n == 0)
        return "0";
    else if (n == 1)
        return "1";
    else
        return fibo(n - 2) + fibo(n - 1);

}
  
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n,k;
		cin>>n>>k;
    string tmp= fibo(n);
    cout<<tmp[k-1]<<endl;
}
    return 0;
}
