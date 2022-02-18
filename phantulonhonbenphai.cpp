#include<iostream>
#include<stack>
using namespace std;
void printNGE(long long arr[], long long n)
{
    stack<long long> s;
    long long arr1[n];
    for (long long i = n - 1; i >= 0; i--) 
    {
        while (!s.empty() && s.top() <= arr[i])
            s.pop();
        if (s.empty()) 
            arr1[i] = -1;         
        else 
            arr1[i] = s.top();        
  
        s.push(arr[i]);
}
    for (long long i = 0; i < n; i++)
        cout << arr1[i] <<" ";
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		long long n;
		cin>>n;
		long long a[n+5];
		for(long long i=0;i<n;i++)
		{
			cin>>a[i];
		}
		printNGE(a,n);
		cout<<endl;
	}
	return 0;
}
