#include <iostream>
#include<algorithm>
using namespace std;
 
int countTriplets(int arr[], int n, int sum)
{
    int ans = 0;
    for (int i = 0; i < n-2; i++)
    {
       
       for (int j = i+1; j < n-1; j++)
       {
           
           for (int k = j+1; k < n; k++)
               if (arr[i] + arr[j] + arr[k] <= sum)
                   ans=max(ans,arr[i] + arr[j] + arr[k]);
       }
    }
 
    return ans;
}
 
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	    int n,k;
	    cin>>n>>k;
	    int a[n+1];
	    for(int i=0;i<n;i++)
	    {
	    	cin>>a[i];
		}
	 
	    int len = countTriplets(a,n,k);
	 	cout << len << endl;
	}
    return 0;
}


