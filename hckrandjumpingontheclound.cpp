#include <bits/stdc++.h>

using namespace std;


int main()
{
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    int res=0;
    int i=0;
    while(i<n-1)
    {
        if(a[i]!=1)
        {
			if(a[i+2]!=1)
            {
                res++;
                i=i+2;
            }
            else if(a[i+1]!=1)
            {
                res++;
                i=i+1;
            }
        }
        //else i++;
    }
    cout<<res;
}

