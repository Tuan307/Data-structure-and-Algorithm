#include<iostream>
#include<algorithm>
#include<stack>
using namespace std;
int main(){
	int t;
	cin >> t;
	while(t--){
		int n;
		cin >> n;
		int a[n];
		for(int i = 0 ; i < n ; i++){
			cin >> a[i];
		}
		int c[n+5];
		c[0]=1;
		stack<int> st;
		st.push(-1);
		st.push(0);
		for(int i=1;i<n;i++)
		{
			while(st.top()!=-1&&a[st.top()]<=a[i])
			{
				st.pop();
			}
			c[i]=i-st.top();
			st.push(i);
		}
		for(int i=0;i<n;i++)
		{
			cout<<c[i]<<" ";
		}
		cout << endl;
	}
	return 0;
}
