#include <iostream>
#include<algorithm>

using namespace std;

int main()
{
    int n;
    cin>>n;
    int a[n+1];
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(a[j]>a[i])
            {
                swap(a[i],a[j]);
            }
        }
    }
    cout<<n<<endl;
    for(int i=0;i<=n;i++)
    {
        int count=0;
        int min=a[n-1];
        for(int k=0;k<n;k++)
        {
          a[k]=a[k]-min;
          if(a[k]!=0)
		  {
		  count++;
	     }
        }
        cout<<count<<endl;
        n=count;
        
    }
    return 0;
}
