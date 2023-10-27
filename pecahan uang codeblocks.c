#include<stdio.h>
#include<stdlib.h>

int main()
{
int n1,n2,n3,n4, max=0;
printf("Masukan Nilai 1:");
scanf("%d",&n1);
printf("Masukan Nilai 2:");
scanf("%d",&n2);
printf("Masukan Nilai 3:");
scanf("%d",&n3);
printf("Masukan Nilai 4:");
scanf("%d",&n4);

    max=n1;
    if(max<n2)
    max=n2;
    if(max<n3)
    max=n3;
    if(max<n4)
    max=n4;

printf("Bilangan Terbesar:%d", max);
getch();
return 0;
}
