#include<iostream>
#include<stack>
#include<algorithm>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		string s;
		cin>>s;
		int n=s.size();
		stack<int> st;
		//st.push(-1);
		//int res=0;
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
		for(int i=0;i<n;i++)
		{
			if(s[i]!='('&&s[i]!=')')
			cout<<s[i];
		}
		cout<<endl;
	}
	return 0;
}

