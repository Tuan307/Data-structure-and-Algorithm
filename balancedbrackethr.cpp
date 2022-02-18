#include<iostream>
#include<stack>
#include<map>
using namespace std;

int main()
{
	map<char,char> mp;
mp[')']='(';
mp[']']='[';
mp['}']='{';
	int t;
	cin>>t;
	while(t--)
	{
		string s;
		cin>>s;
		cin.ignore();
		stack<char> st;
		bool ok=true;
	
		    for(int i=0;i<s.size();i++)
		    {
			    if(s[i]=='{'||s[i]=='['||s[i]=='(')
			    {
				    st.push(s[i]);
			    }
			    else
			    {
			    	if(st.empty()||mp[s[i]]!=st.top())
			    	{
			    		cout<<"NO";
			    		ok=false;
			    		break;
					}
					else st.pop();
				}
	        }
	    if(ok&&st.empty()) cout<<"YES";
		cout<<endl;
	}
	return 0;
}
