#include <iostream>

int main()
{
                int A,B,C,D;
                cout<<"\t\t Mencari Bilangan Terbesar terdiri dari 4 Angka";
                cout<<"Bilangan 1: ";
                cin>>A;
                cout<<"Bilangan 2: ";
                cin>>B;
                cout<<"Bilangan 3: ";
                cin>>C;
                cout<<"Bilangan 4: ";
                cin>>D;

                if (A>B)
                                if (A>C)
                                 if (A>D)
                                 cout<<"Bilangan Terbesar adalah "<<A;
                                 else
                                 cout<<"Bilangan Terbesar adalah "<<D;
                                else
                                 if (C>D)
                                 cout<<"Bilangan Terbesar adalah "<<C;
                                 else
                                 cout<<"Bilangan Terbesar adalah "<<D;
                else
                                if(B>C)
                                 if(B>D)
                                 cout<<"Bilangan Terbesar adalah "<<B;
                                 else
                                 cout<<"Bilangan Terbesar adalah "<<D;
                                else
                                 if(C>D)
                                 cout<<"Bilangan Terbesar adalah "<<C;
                                 else
                                 cout<<"Bilangan Terbesar adalah "<<D;

}
