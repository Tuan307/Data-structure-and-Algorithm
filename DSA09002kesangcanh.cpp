#include<bits/stdc++.h>
using namespace std;
int main()
{
	    ios_base::sync_with_stdio(0);
	    cin.tie(0);
		int n;
		cin>>n;
		vector<int> a[100];
		for(int i=1;i<=n;i++)
		{
			string s;
			cin>>s;
			s+=" ";
			int so=0;
			int j=0;
			while(j<s.size())
			{
				if(s[j]>='0'&&s[j]<='9')
				{
					so=so*10+(int)(s[j]-'0');
				}
				else if(so>0)
				{
					a[i].push_back(so);
				}
			}
			j++;
		}
		for(int i=1;i<=n;i++)
		{
			sort(a[i].begin(),a[i].end());
		}
		int res[100][100];
		memset(res,0,sizeof(res));
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<a[i].size();j++)
			{
				if(!res[i][a[i][j]]&&!res[a[i][j]][i])
				{
					cout<<i<<" "<<a[i][j];
					cout<<endl;
				}
				res[i][a[i][j]]=res[a[i][j]][i]=1;
			}
		}
	return 0;
}

