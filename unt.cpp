#include<iostream>
using namespace std;
int nhapandtinh(int n)
{
	int p=1;
	int x;
	for(int i=0;i<n;i++)
	{
		cin>>x;
		p*=x;
	}
	return p;
}

void tinhsokhong(int n)
{
	int res = nhapandtinh(n);
	int count=0;
	int t;
	while(res!=0)
	{
		t= res%10;
		if(t==0)
		{
			count+=1;
		}
		else
		{
			break;
		}
		res/=10;
	}
	cout<<count;
	
}
int main()
{
	int n;
	cout<<"Nhap vao so n"<<endl;
	cin>>n;
	cout<<"Nhap n so tu nhien"<<endl;
	tinhsokhong(n);
	return 0;
}
