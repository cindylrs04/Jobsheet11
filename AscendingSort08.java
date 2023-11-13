public class AscendingSort08 {
    public static void main(String[] args) {
        String[][] peserta = {
                { "Cindy", "Dewi", "Mella", "Innam", "Vira" },
                { "Mera", "Reika", "Esa", "Farrel", "Dhini" },
                { "Afifah", "Vincent", "Luthfi", "Ivan", "Nanda" },
                { "Rangga", "Claudya", "Farhan", "Samid", "Zaky" },
        };
        String[] jenisOlahraga = { "Badminton", "Tenis meja", "Basket", "Bola Voli" };

        for (int i = 0; i < peserta.length; i++) {
            for (int j = 0; j < peserta[i].length - 1; j++) {
                for (int k = 0; k < peserta[i].length - j - 1; k++) {
                    if (peserta[i][k].compareToIgnoreCase(peserta[i][k + 1]) > 0) {
                        String temp = peserta[i][k];
                        peserta[i][k] = peserta[i][k + 1];
                        peserta[i][k + 1] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < peserta.length; i++) {
            System.out.println("Cabang Olahraga " + jenisOlahraga[i]);
            for (int j = 0; j < peserta[i].length; j++) {
                System.out.println("Atlet ke-" + (j + 1) + " : " + peserta[i][j]);
            }
            System.out.println();
        }
    }
}
