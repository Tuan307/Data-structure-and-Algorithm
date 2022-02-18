#include<iostream>

using namespace std;

//int sq(int x)
//{
//	return x*x;
//}
//// ham tinh 2 mu, may em bi loi devc nen khong dung thu vien duoc, con neu dung
////duoc thu vien thi dung ham pow(a,b) cho no nhanh
//int count_pow(int a,int b)
//{
//	if(b==0)
//	{
//		return 1;
//	}
//	else
//	{
//		if(b%2==0)
//		{
//			return sq(count_pow(a,b/2));
//		}
//		else
//		{
//			return a*sq(count_pow(a,b/2));
//		}
//	}
//}
//int check(string s){
//	int sum=0;
//	int m=0;
//	for(int i=s.length()-1;i>=0;i++)
//	{
//		sum = sum + count_pow(2,m)*(int)(s[i]-'0');
//		m++;
//	}
//	return sum;
//}
int binaryToDecimal(int n)
{
    int num = n;
    int dec_value = 0;
 
   
    int base = 1;
 
    int temp = num;
    while (temp) {
        int last_digit = temp % 10;
        temp = temp / 10;
 
        dec_value += last_digit * base;
 
        base = base * 2;
    }
 
    return dec_value;
}
int main()
{
	int n;
	cin>>n;
	int a[n];
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
	}
	int chan[n];
	int le[n];
	int m=0,k=0;
	for(int i=0;i<n;i++)
	{
		if(binaryToDecimal(a[i])%2==0)
		{
			chan[m++]=a[i];
		}
		else
		{
			le[k++]=a[i];
		}
	}
	cout<<"Chan"<<endl;
	for(int i=0;i<m;i++)
	{
		cout<<chan[i]<<" ";
	}
	cout<<"LE"<<endl ;
	for(int i=0;i<k;i++)
		{
			cout<<le[i]<<" ";
		}

}
