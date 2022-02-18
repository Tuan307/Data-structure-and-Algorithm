#include<iostream>
#include<string>
#include<string.h>
using namespace std;
void chuanhoa(string s)
{
	for(int i=0;s[i]==' ';++i){
		s.erase(i,1);
	}
   if(s[0]==' ')
   {
   	s.erase(0,1);
   }
   for(int i=0;i<s.size();i++)
   {
   	if(s[i]==' '&&s[i+1]==' ')
   	{
   		s.erase(i+1,1);
   		--i;
	   }
   }
   if(s[s.size()-1]==' ')
   {
   	s.erase(s.size()-1,1);
   }
   int tmp;
   for(int i=s.size()-1;s[i]!=' ';i--)
   {
   	tmp=i;
   	if(s[i]>96&&s[i]<123)
   	{
   		s[i]-=32;
	   }
   }
   for(int i=0;i<tmp;i++)
   {
   	if(s[i]>=65&&s[i]<=90)
   	{
   		s[i]+=32;
	   }
   }
   s[0]-=32;
   cout<<s[0];
   for(int i=1;i<tmp-1;i++)
   {
   	if(s[i]==' ')
   	{
   		s[i+1]-=32;
	   }
	   cout<<s[i];
   }
   cout<<", ";
   for(;tmp<s.size();tmp++)
   {
   	cout<<s[tmp];
   }
   
}
int main()
{
	string s;
	getline(cin,s);
	chuanhoa(s);
	return 0;
}
