#include<stdio.h>
void main(){
int angka1, angka2, hasil=0;
char opr;
printf("Masukkan ekspresi:"); scanf("%d %1c %d", &angka1, &opr, &angka2);
    printf("Hasil:");
switch (opr){
    case '+' : hasil= angka1+angka2; printf("%d \n", hasil); break;
case '-' : hasil= angka1-angka2; printf("%d \n", hasil); break;
    case '*' : hasil= angka1*angka2; printf("%d \n", hasil); break;
case '/' : hasil= angka1/angka2; printf("%d \n", hasil); break;
    default : puts("Operator tidak dikenali"); }}
