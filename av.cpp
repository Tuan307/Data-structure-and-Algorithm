#include<bits/stdc++.h>
using namespace std;
string fibWord(int n)
{
    string Sn_1 = "0";
    string Sn = "1";
    string tmp;
    for (int i=3; i<=n; i++)
    {
        tmp = Sn;
        Sn += Sn_1;
        Sn_1 = tmp;
    }
    return Sn;
}
  
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	int n,k
	cin>>n;
    cout << fibWord(n);
}
    return 0;
} 
