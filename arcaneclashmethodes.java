import java.util.Scanner;

public class arcaneclashmethodes {

        public static String pilihKarakter(Scanner input, String[] CharacterName, int[] InitialHp) {
        boolean MenuPilihChara = true;
        String PilihChara = "";

        while (MenuPilihChara) {
            System.out.println("Silahkan pilih character anda\n1. Aria\t\t2. Bisky");
            PilihChara = input.nextLine();

            if (PilihChara.equalsIgnoreCase(CharacterName[0]) || PilihChara.equals("1")) {
                System.out.println("Aria adalah seorang penyihir muda dari keluarga kerajaan yang diberkati dengan energi sihir yang sangat besar.");
                System.out.println("Namun, tubuhnya tidak mampu untuk menampung energi sihirnya yang besar sehingga kemampuan fisik Aria lebih lemah dari kebanyakan manusia.");
                System.out.println("\nAria's stat:\nHP: " + InitialHp[0] + "\nATK: 150");
                System.out.println("\n1. Next\t\t2. Back");
                String NextorBack = input.nextLine();

                if (NextorBack.equalsIgnoreCase("Next") || NextorBack.equals("1")) {
                    MenuPilihChara = false;
                    System.out.println("========== GAME START ==========");
                }
            } else if (PilihChara.equalsIgnoreCase(CharacterName[1]) || PilihChara.equals("2")) {
                System.out.println("Bisky adalah seorang petarung tangguh yang berasal dari desa yang berada di tengah hutan");
                System.out.println("Ia memiliki kekuatan fisik jauh di atas manusia biasa");
                System.out.println("\nBisky's stat:\nHP: " + InitialHp[1] + "\nATK: 100");
                System.out.println("\n1. Next\t\t2. Back");
                String NextorBack = input.nextLine();

                if (NextorBack.equalsIgnoreCase("Next") || NextorBack.equals("1")) {
                    MenuPilihChara = false;
                    System.out.println("========== GAME START ==========");
                }
            }
        }
        return PilihChara;
    }

        public static void cekkondisimenang(int[] HpCharacter){
            if (HpCharacter[0] > 0 && HpCharacter[1] == 0) {
                System.out.println("Bisky: Ouch! wow Aria, I never knew that you're really good at this");
                System.out.println("Congrats Aria, You Win!");
                System.out.println("========== GAME END ==========");
                System.exit(0);
            } else if (HpCharacter[1] > 0 && HpCharacter[0] == 0) {
                System.out.println("Aria: Ouch! wow Bisky, I never knew that you're really good at this");
                System.out.println("Congrats Bisky, You Win!");
                System.out.println("========== GAME END ==========");
                System.exit(0);
            }
        }

        public static void cekkondisiminus(int[] HpCharacter, int[] InitialHp){
            if (HpCharacter[0] < 0) {
                System.out.println("Ooopss, apa kamu tidak bisa matematika?");
                System.out.println("Memulihkan HP Aria");
                HpCharacter[0] = InitialHp[0];
                System.out.println("Hp Aria saat ini: " + HpCharacter[0]);
            } else if (HpCharacter[1] < 0) {
                System.out.println("Ooopss, apa kamu tidak bisa matematika?");
                System.out.println("Memulihkan HP Bisky");
                HpCharacter[1] = InitialHp[1];
                System.out.println("HP Bisky saat ini: " + HpCharacter[1]);
            }
        }    
}
