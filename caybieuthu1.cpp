#include<iostream>
#include<stack>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		string s;
		cin>>s;
		stack<string> st;
		for(int i=0;i<s.size();i++)
		{
			if(s[i]=='+'||s[i]=='-'||s[i]=='*'||s[i]=='/'||s[i]=='%'||s[i]=='^')
			{
				string n1=st.top();
				st.pop();
				string n2=st.top();
				st.pop();
				string tmp=n2+s[i]+n1;
				st.push(tmp);
			}
			else st.push(string(1,s[i]));
		}
		cout<<st.top()<<endl;
	}
	return 0;
}
