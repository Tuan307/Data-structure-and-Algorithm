#include<bits/stdc++.h>
using namespace std;
int minSwaps(int arr[], int n)
{
    pair<int, int> arrPos[n];
    for (int i = 0; i < n; i++)
    {
        arrPos[i].first = arr[i];
        arrPos[i].second = i;
    }
    sort(arrPos, arrPos + n);
    vector<bool> vis(n, false);
    int ans = 0;
    for (int i = 0; i < n; i++)
    {
        if (vis[i] || arrPos[i].second == i)
            continue;
        int cycle_size = 0;
        int j = i;
        while (!vis[j])
        {
            vis[j] = 1;
            j = arrPos[j].second;
            cycle_size++;
        }
 
        if (cycle_size > 0)
        {
            ans += (cycle_size - 1);
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
		int n;
		cin>>n;
		int a[n+1];
		for(int i=0;i<n;i++)
		{
			cin>>a[i];
		}
		cout << minSwaps(a, n);
		cout<<endl;
	}
	return 0;
}

