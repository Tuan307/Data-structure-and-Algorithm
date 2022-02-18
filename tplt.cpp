/*
14
0 1 0 0 0 0 0 0 0 0 0 0 0 0
1 0 1 0 0 0 0 0 0 0 0 0 0 0
0 1 0 1 0 0 0 0 0 0 0 0 0 0
0 0 1 0 1 0 0 0 0 0 0 0 0 0
0 0 0 1 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 1 0 0 0 0 0
0 0 0 0 0 0 0 1 0 0 0 0 0 0
0 0 0 0 0 0 1 0 1 0 0 0 0 0
0 0 0 0 0 1 0 1 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 1 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 1 0
0 0 0 0 0 0 0 0 0 0 1 0 0 0
0 0 0 0 0 0 0 0 0 0 1 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 0 0
output :4
12
1 2 3 4 5 6 7 8 9 10 11 12
0 1 0 0 1 0 0 0 0 0 0 1
1 0 1 0 0 0 0 0 0 0 0 0  
0 1 0 1 0 1 0 0 0 0 0 0 
0 0 1 0 1 0 0 0 0 0 0 0 
1 0 0 1 0 0 1 0 0 0 0 0 
0 0 1 0 0 0 0 0 1 0 0 0 
0 0 0 0 1 0 0 1 0 0 0 0 
0 0 0 0 0 0 1 0 1 1 0 0 
0 0 0 0 0 1 0 1 0 0 0 0 
0 0 0 0 0 0 0 1 0 0 1 0 
0 0 0 0 0 0 0 0 0 1 0 1 
1 0 0 0 0 0 0 0 0 0 1 0
output: 1 */
#include<iostream>
#include<stack>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int a[n+1][n+1];
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            cin>>a[i][j];
        }
    }
    int check[n+1]={0};
    int count=0;
    for(int i=1;i<=n;i++)
    {
        if(check[i]==0)
        {
            count++;
            check[i]=1;
            stack<int> t;
            t.push(i);
            while(!t.empty())
            {
                int k=t.top();
                t.pop();
                for(int j=1;j<=n;j++)
                {
                    if(check[j]==0&&a[k][j]==1)
                    {
                        check[j]=1;
                        t.push(k);
                        t.push(j);
                        break;
                    }
                }
            }
        }
    }
    cout<<count<<endl;
    return 0;
    
}
