#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		string a,b;
		cin>>a>>b;
		while(a.size()<b.size()) a="0"+a;
        while(a.size()>b.size()) b="0"+b;
        string res="";
        int carry=0;
        for(int i=a.size()-1;i>=0;i--)
        {
        	int tmp=a[i]-'0'+b[i]-'0'+carry;
        	tmp=tmp%10;
        	carry=tmp/10;
        	res=char(tmp+'0')+res;
		}
		if(carry>0)
		{
			res="1"+res;
		}
		cout<<res<<endl;
	}
	return 0;
}

