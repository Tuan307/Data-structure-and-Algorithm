#include<bits/stdc++.h>
using namespace std;
string fibWord(int n)
{
    string Sn1 = "A";
    string Sn2= "B";
    string tmp;
    for (int i=3; i<=n; i++)
    {
        tmp = Sn2;
        Sn2+= Sn1;
        Sn1 = tmp;
    }
    return Sn2;
}
int main()
{
	ios_base::sync_with_stdio(0);
    cin.tie(0);
	int t;
	cin>>t;
	while(t--)
	{
       int n,k;
       cin>>n>>k;
       string res= fibWord(n);
	   cout<<res[k-1]; 
	}
	return 0;
}

