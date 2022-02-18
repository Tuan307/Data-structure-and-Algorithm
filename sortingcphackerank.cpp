#include<bits/stdc++.h>
using namespace std;
struct dta
{
   int score;
   string name;	
};
bool compare(dta a,dta b)
{
	if(a.score>b.score) return true;
	else if(a.score==b.score&&a.name[0]<b.name[0]) return true;
}
int main()
{
	int n;
	cin>>n;
	vector<dta> player(n);
	for(int i=0;i<n;i++)
	{
		cin>>player[i].name;
		cin>>player[i].score;
	}
	sort(player.begin(),player.end(),compare);
	for(int i=0;i<n;i++)
	{
		cout<<player[i].name<<" "<<player[i].score<<endl;
	}
	return 0;
}

