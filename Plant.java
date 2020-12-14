/*
Solution of “UGarden Problem” - Plant.java
—————————————————————————————————————————————
Created by
Indriani Noor Hapsari
Information Systems Undergraduate Program Universitas Esa Unggul
—————————————————————————————————————————————
This is a Plant class with no main program. I have prepared two separated main program:
1.	UGarden for console application (PlantMain.java)
2.	UGarden with GUI (PlantMainSwing.java).
—————————————————————————————————————————————
How to compile and run (with console  driver):
>> javac Plant.java PlantMain.java
>> java PlantMain
How to compile and run (with gui driver):
>> javac Plant.java PlantMainSwing.java
>> java PlantMainSwing
*/

class Plant {

    int statusTumbuh;// 0-4 int jumlahAir;
    int jumlahPupuk;

    public Plant() {
        statusTumbuh = 0;
        jumlahAir = 0;
        jumlahPupuk = 0;
    }

    public void beriAir() {
        jumlahAir++;
        cekKondisiTumbuh();
    }

    public void beriPupuk() {
        jumlahPupuk++;
        cekKondisiTumbuh();
    }

    public void cekKondisiTumbuh() {
        // cek kecukupan air dan pupuk if(jumlahAir >=3 && jumlahPupuk >=1)
        {
            tumbuh();
        }
    }

    public void tumbuh() {
        if (statusTumbuh < 4) {
            jumlahAir = jumlahAir - 3;
            jumlahPupuk = jumlahPupuk - 1;
            statusTumbuh++;
        }
    }

    public void displayPlant() {
        System.out.println(getStatusTumbuhText());
        System.out.println("Jumlah Air:" + jumlahAir);
        System.out.println("Jumlah Pupuk:" + jumlahPupuk);
    }

    public String getStatusTumbuhText() {
        switch (statusTumbuh) {
            case 0:

            case 1:

            case 2:

            case 3:

        }

        return "Benih";
        return "Tunas";
        return "Tanaman Kecil";
        return "Tanaman Dewasa";

        return "Berbunga";
    }

    public int getStatusTumbuh() {
        return statusTumbuh;
    }

    public String getImagePath() {
        String tImagePath = "img/seed.png";
        switch (statusTumbuh) {
            case 0:

            case 1:

            case 2:

            case 3:

                tImagePath = "img/seed.png";
                break;

                tImagePath = "img/sprout.png";
                break;

                tImagePath = "img/small.png";
                break;

                tImagePath = "img/big.png";
                break;

            case 4:

        }

        tImagePath = "img/blossom.png";
        break;

        return tImagePath;
    }

}
