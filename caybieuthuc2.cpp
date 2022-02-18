#include<iostream>
#include<queue>
#include<string>
#include<stack>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		cin.ignore();
	    string s;
		getline(cin,s);
		queue<long long>q;
		stack<string> st;
		for(int i=s.size()-1;i>=0;i--)
		{
			if(s[i]!=' ')
			{
			
				if(s[i]=='+'||s[i]=='-'||s[i]=='*'||s[i]=='/'||s[i]=='%'||s[i]=='^')
				{
					long long a=q.front(); q.pop();
					long long b=q.front(); q.pop();
					long long tmp;
					if(s[i]=='+')
					{
						tmp=b+a;
					}
					else if(s[i]=='-') tmp=b-a;
				    else if(s[i]=='*') tmp=a*b;
				    else if(s[i]=='/') tmp=b/a;
				    else if(s[i]=='%') tmp=b%a;
				    else if(s[i]=='^')
				    {
					    tmp=b;
					    for(int i=0;i<a-1;i++)
					    {
						    tmp*=b;
					    }
				    }
				    //q.push(tmp);
				}
				else
				{
				st.push(string(1,s[i]));
			}
		}		
		}	
		while(st.size()>0)
		{
			cout<<st.top()<<" ";
			st.pop();
		}
	}		 
	return 0;
}
