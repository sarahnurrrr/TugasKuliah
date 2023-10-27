#include<stdio.h>
void main(){
    char jawab;
    printf("Lanjutkan(y/t)?\n");
    scanf("%c", &jawab);
    if ((jawab=='y')||(jawab=='Y'))
    printf("Langkah kedua, masukkan password anda\n");
    else
    puts("Terimakasih"); }
