#include<bits/stdc++.h>
using namespace std;
struct SV
{ 
    char name[100];
	int age;
	char sex[5];
	float toan;
	float anh;
	float ly;
	float tb=0;	
};
struct SV nhap()
{
	struct SV sv;
    cin.ignore();
	gets(sv.name);
	cin>>sv.age;
	cin>>sv.toan;
	cin>>sv.ly;
	cin>>sv.anh;
	cin>>sv.sex;	
}
int main()
{
	struct SV dssv[100];
	int slsv=0;
	struct SV sv;
	sv=nhap();
	dssv[slsv++]=sv;
	cout<<sv.name<<" "<<sv.sex;
	return 0;
}

