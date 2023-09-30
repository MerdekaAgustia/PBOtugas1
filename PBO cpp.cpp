#include <iostream>
using namespace std;

int main() {
    char ulangi;

    do {
        int awal, akhir;

        cout << "Masukkan Batas atas: ";
        cin >> awal;

        cout << "Masukkan Batas Akhir: ";
        cin >> akhir;

        cout << "Bilangan genap dalam rentang " << awal << " hingga " << akhir << " adalah:" << endl;

        // Menampilkan bilangan genap
        for (int num = awal; num <= akhir; num++) {
            if (num % 2 == 0) {
                cout << num << " ";
            }
        }

        cout << endl;

        cout << "Apakah Anda ingin mengisi data lagi? (y/n): ";
        cin >> ulangi;

    } while (ulangi == 'y' || ulangi == 'Y');

    cout << "Thank You" << endl;

    return 0;
}

