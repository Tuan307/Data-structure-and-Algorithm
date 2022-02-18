#include<bits/stdc++.h>
using namespace std;
class SinhVien
{
	private:
	string name;
	string sex;
	int age;
	float toan;
	float ly;
	float anh;
	public:
		float trungbinh=0;
	SinhVien()
	{
		this->name=name;
		this->sex=sex;
		this->age=age;
		this->toan=toan;
		this->ly=ly;
		this->anh=anh;
		this->trungbinh=trungbinh;
	}
	void nhap()
	{
		cin.ignore();
		getline(cin,name);
		getline(cin,sex);
		cin>>age;
		cin>>toan;
		cin>>ly;
		cin>>anh;
		trungbinh=(toan+ly+anh)/3;
	}
	void xeploai()
	{
		if(trungbinh>=8&&trungbinh<=10) cout<<"Gioi"<<endl;
		if(trungbinh>=7.5&&trungbinh<8) cout<<"Kha"<<endl;
		if(trungbinh>=5&&trungbinh<7.5)  cout<<"TB"<<endl;
	}
	void display()
	{
		cout<<name<<endl;
		//cout<<sex<<endl;
		//cout<<age<<endl;
		//cout<<toan<<endl;
		//cout<<ly<<endl;
		//cout<<anh<<endl;
		cout<<trungbinh<<endl;
		xeploai();
	}
};
int main()
{
	int n;
	cin>>n;
	SinhVien sv[100];
	int slsv=0;
	//SinhVien sv;
	for(int i=1;i<=n;i++)
	{
	sv[i].nhap();
	//sv.display();
    }
    for(int i=1;i<=n;i++)
    {
    	if(sv[i].trungbinh>sv[i+1].trungbinh)
    	{
    		sv[i].display();
		}
		else sv[i+1].display();
		break;
	}
	return 0;
}

