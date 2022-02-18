#include<iostream>
#include<stack>
using namespace std;
int n,s;
int a[1001][1001];
void input()
{
    cin>>n;
    cin>>s;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            cin>>a[i][j];
        }
    }
}
void euler(int u)
{
    stack<int> st,ce;
    st.push(u);
    while(!st.empty())
    {
        int count=0;
        int s=st.top();
        for(int i=1;i<=n;i++)
        {
            if(a[s][i]==0)
            {
                count++;
            }
        }
        if(count!=n)
        {
            for(int i=1;i<=n;i++)
            {
                if(a[s][i]==1)
                {
                    st.push(i);
                    a[s][i]=a[i][s]=0;
                    break;
                }
            }
        }
        else
        {
            ce.push(s);
            st.pop();
        }
    }
    while(!ce.empty())
    {
        cout<<ce.top()<<" ";
        ce.pop();
    }
}
int main()
{
    input();
    euler(s);
    return 0;
}
