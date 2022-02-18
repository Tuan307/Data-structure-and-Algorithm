#include<iostream>
#include<algorithm>
#include<stack>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int s,d;
		cin>>s>>d;
		stack<int> st;
		while(s>0)
		{
			d--;
			if(s>9)
			{
				st.push(9);
				s-=9; 
			}
			else
			{
				st.push(s);
				break;
			}
		}
		if(d<0) cout<<"-1";
		else
		{
			if(d>0)
			{
				int num=st.top();
				st.pop();
				st.push(num-1);
				while(d>1)
				{
					st.push(0);
					d--;
				}
				st.push(1); 
			}
			while(st.size()>0)
			{
				cout<<st.top();
				st.pop();
			}
		}
		cout<<endl;
	}
	return 0;
}
