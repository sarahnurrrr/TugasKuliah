//Seluruh Tahun Kabisat
#include <stdio.h>
void main(){
int awal, akhir, kabisat;
printf("Input batas tahun awal:");
scanf("%i", &awal);
printf("Input batas tahun akhir:");
scanf("%i", &akhir);
printf("Seluruh tahun kabisat antara tahun %i hingga tahun %i\n",awal,akhir);
    for(kabisat=awal; kabisat<=akhir; kabisat++)
    {
        if((kabisat%4==0)||(kabisat%400==0)&&(kabisat%100!=0)){
        printf("Tahun kabisat %i \n",kabisat);
    }
    else{
        printf(" ");
    }
    }
}
