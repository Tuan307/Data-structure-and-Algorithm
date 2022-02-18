#include<bits/stdc++.h>
using namespace std;
string to_string(long long n)
{
    string s="";
    while(n>0)
    {
        s=char(n%10+'0')+s;
        n/=10;
    }
    return s;
}
int main()
{
    string s;
    getline(cin,s);
    long long count;
    int flag;
    string str="";
    for(int i=0;i<s.size();i++)
    {
        count=1;
        for(int j=i+1;j<=s.size();j++)
        {
            if(s[i]==s[j])
            {
                count++;
            }
            else
            {
                flag=i;
                i=j-1;
                break;
            }
        }
        if(count==1)
        {
            str=str+s[flag]+'1';
        }
        else
        {
        	str=str+s[flag]+char(count+'0');
		}
    }
    cout<<str;
}
