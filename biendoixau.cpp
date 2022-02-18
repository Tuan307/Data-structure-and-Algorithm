#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		string s1,s2;
		cin>>s1>>s2;
		int n1=s1.length();
		int n2=s2.length();
		int check[n1+1][n2+1];
		for(int i=0;i<=n1;i++)
		{
			for(int j=0;j<=n2;j++)
			{
				if(i==0||j==0)
				{
					check[i][j]=i+j;
				}
				else if(s1[i-1]==s2[j-1])
				{
					check[i][j]=check[i-1][j-1];
				}
				else
				{
					check[i][j]=min(check[i-1][j-1],min(check[i-1][j],check[i][j-1]))+1;
				}
			}
		}
		cout<<check[n1][n2]<<endl;
	}
	return 0;
}
