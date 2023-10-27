#include <stdio.h>
void hitung_luas(int panjang, int lebar);
void main(){
int panjang = 9;
int lebar = 4;
int luas;
hitung_luas(panjang,lebar);
hitung_luas(10,5);
hitung_luas(12,8);
}
void hitung_luas(int panjang, int lebar){
int luas;
luas = panjang * lebar;
printf("%d * %d = %d \n",panjang, lebar, luas);
}
