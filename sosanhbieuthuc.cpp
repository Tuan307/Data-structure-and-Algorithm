#include<iostream>
#include<stack>
#include<algorithm>
using namespace std;
string convert(string s)
{
	    int n=s.size();
		stack<int> st;
		for(int i=0;i<n;i++)
		{
			if(s[i]=='(')
			{
				st.push(i);
			}
			else if(s[i]==')')
			{
				int top=st.top();
				st.pop();
				if(s[top-1]=='+') continue;
				else if(s[top-1]=='-')
				{
					for(int j=top;j<=i;j++)
					{
						if(s[j]=='+') s[j]='-';
						else if(s[j]=='-') s[j]='+';
					}
				}
			}
		}
		string s1="";
		for(int i=0;i<n;i++)
		{
			if(s[i]!='('&&s[i]!=')')
			s1+=s[i];
		}
		return s1;
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		string s1;
		cin>>s1;
		string s2;
		cin>>s2;
		s1=convert(s1);
		s2=convert(s2);
		if(s1!=s2) cout<<"NO";
		else cout<<"YES";
		cout<<endl;
	}
	return 0;
}

