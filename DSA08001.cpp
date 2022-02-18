#include<bits/stdc++.h>
using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
		queue<int> st;
		int q,dem=0;
		cin >> q;
		while(q--){
			int so;
			cin >> so;
			if(so == 1) cout << st.size() << endl;
			else if(so==2) (st.size() > 0) ? cout << "NO\n" : cout << "YES\n";
			else if(so==3) {
				int n;
				cin >> n;
				st.push(n);
			}
			else if(so==4  && st.size() > 0) st.pop();
			else if(so == 5) (st.size() > 0) ? cout << st.front() << endl : cout << "-1\n";
			else if(so==6) (st.size() > 0) ? cout << st.back() << endl : cout << "-1\n";
			dem = so;
		}
		if(dem == 4 || dem == 3) cout << endl;
	}
}
