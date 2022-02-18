#include<iostream>
#include<algorithm>
using namespace std;
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
		for(int i=0;i<s.size();i++)
		{
			char max=s[s.size()-1];
			int vt=s.size()-1;
			for(int j=s.size()-1;j>i&&n>0;j--)
			{
				if(max<s[j])
				{
					max=s[j];
					vt=j;
				}
			}
			if(max>s[i]&&n>0)
			{
				swap(s[vt],s[i]);
				n--;
			}
		}
		cout<<s<<endl;
	}
	return 0;
}
