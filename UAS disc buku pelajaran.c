//Buku Pelajaran SMK
#include<stdio.h>

void main(){
    int x, total, disc, bayar, buku, harga;

    printf("Banyaknya buku yang dibeli:");
    scanf("%i",&x);
    buku= 5000;
    total= x*buku;
    printf("total= banyaknya buku*5000: %i\n", total);

    bayar = total;
    if (total<= 500000)
    printf("Anda tidak mendapatkan disc % \nYang harus dibayar: %i\n", bayar);
    bayar = 95*total/100 ;
    if (total> 500000)
    printf("Disc yang anda dapatkan 5 persen \nYang harus dibayar: %i\n", bayar);
    bayar = 85*total/100 ;
    if (total>= 1000000)
    printf("Disc yang anda dapatkan 15 persen \nYang harus dibayar: %i\n", bayar);
    bayar = 83*total/100 ;
    if (total>= 1001000)
    printf("Disc yang anda dapatkan 17 persen \nYang harus dibayar: %i\n", bayar);
}
