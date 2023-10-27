#include<stdio.h>
void main(){
    int hari;
    printf("Masukkan sebuah angka integer:");
    scanf("%d", &hari);
    switch (hari) {
case 0 : puts("Minggu\n"); break;
    case 1 : puts("Senin\n"); break;
case 2 : puts("Selasa\n"); break;
    case 3 : puts("Rabu\n"); break;
case 4 : puts("Kamis\n"); break;
    case 5 : puts("Jumat\n"); break;
case 6 : puts("Sabtu\n"); break;
    default : puts("Angka masukan di luar jangkauan."); } }
