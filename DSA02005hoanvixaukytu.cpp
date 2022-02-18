#include<bits/stdc++.h>
using namespace std;
string s;
bool ok=true;
void act()
{
	int i=s.size()-1;
	while(i>=0&&s[i]>s[i+1]) i--;
	if(i>=0)
	{
		int k=s.size();
		while(k>=0&&s[i]>s[k]) k--;
		swap(s[i],s[k]);
		int r=i+1;
		int e=s.size()-1;
		while(r<e)
		{
			swap(s[r],s[e]);
			r++;
			e--;
		}
	}
	else ok=false;
}
void out()
{
	for(int i=0;i<s.size();i++)
	{
		cout<<s[i];
	}
	cout<<" ";
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	    cin>>s,
		cin.ignore();
		while(ok)
		{
			out();
			act();
		}
		cout<<endl;
		ok=true;
	}
	return 0;
}

