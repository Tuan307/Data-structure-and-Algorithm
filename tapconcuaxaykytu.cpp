#include <bits/stdc++.h>
using namespace std;
void per(string s, int n,int i = -1, string curr = "")
{
    if (i == n)
        return;
  
    cout << curr << " ";
    for (int j = i + 1; j < n; j++) {
        curr += s[j];
        per(s, n, j, curr);
        curr = curr.erase(curr.size() - 1);
    }
    return;
}
void power(string s)
{
    sort(s.begin(), s.end());
    per(s, s.size());
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
    int n;
    cin>>n;
    string s;
    cin>>s;
    power(s);
    cout<<endl;
}
    return 0;
}
