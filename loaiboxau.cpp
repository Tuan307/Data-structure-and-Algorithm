#include<bits/stdc++.h>
using namespace std;
int main()
{
		string a,b;
		getline(cin,a);
		getline(cin,b);
        for(int i=0;i<a.size();i++)
        {
        	if(a[i]==b[0]&&a[b.size()+i-1]==b[b.size()-1])
        	{
        		int j;
        		for( j=i;j<a.size();j++)
        		{
        			a[j]=a[j+b.size()];
				}
				a[j+b.size()]='\0';
				break;
			}
		}
		cout<<a<<endl;
	return 0;
}

