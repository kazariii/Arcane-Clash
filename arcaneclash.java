import java.util.Scanner;

public class arcaneclash {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tebak = 0;
        int[] InitialHp = new int[] {100, 150};
        int[] HpCharacter = new int[] {100, 150};
        String[] CharacterName = new String[] {"Aria", "Bisky"};

        String PilihChara = arcaneclashmethodes.pilihKarakter(input, CharacterName, InitialHp);

        String PilihSkill = "";
        Boolean turn = PilihChara.equalsIgnoreCase(CharacterName[0]) || PilihChara.equals("1");
        Boolean startgame = true;

        while (startgame) {
            int AngkaRandom = (int) (Math.random()*2)+1;
            
            arcaneclashmethodes.cekkondisimenang(HpCharacter);

            arcaneclashmethodes.cekkondisiminus(HpCharacter, InitialHp);

            // Giliran Pemain
            if (turn) {
                System.out.println("Aria's Turn!!");
                System.out.println("Pilih jenis serangan:\n1. Basic Attack\t\t2. Cast Skill");
                System.out.println("DMG Basic Attack = 15\nDMG Cast Skill = 30");
                System.out.println("Hp Bisky saat ini: " + HpCharacter[1]);
                PilihSkill = input.nextLine();
                
                if (PilihSkill.equals("1") || PilihSkill.equalsIgnoreCase("Basic Attack")) {
                    System.out.println("Silahkan pilih suatu angka dari 1-2, jika tebakanmu benar kamu dapat melancarkan serangan!");
                    tebak = input.nextInt();
                    input.nextLine();    
                    if (tebak == AngkaRandom) {
                        System.out.println("Aria melancarkan Basic Attack kepada Bisky, mengurangi 15 HP");
                        HpCharacter[1] -= 15;
                        } else{
                            System.out.println("Gagal melancarkan serangan, tebakan anda salah!! menghasilkan 0 damage");
                        }
                } else if (PilihSkill.equals("2") || PilihSkill.equalsIgnoreCase("Cast Skill")) {
                    System.out.println("Silahkan pilih suatu angka dari 1-2, jika tebakanmu benar kamu dapat melancarkan serangan!");
                    tebak = input.nextInt();
                    input.nextLine();    
                    if (tebak == AngkaRandom){
                        System.out.println("Aria melancarkan Cast Skill kepada Bisky, mengurangi 30 HP");
                        HpCharacter[1] -= 30;
                        } else{
                            System.out.println("Gagal melancarkan serangan, tebakan anda salah!! menghasilkan 0 damage");
                        }
                }
                System.out.println("HP Bisky tersisa " + HpCharacter[1] + "\n");

            } else {
                System.out.println("Bisky's Turn!!");
                System.out.println("Pilih jenis serangan:\n1. Basic Attack\t\t2. Cast Skill");
                System.out.println("DMG Basic Attack = 10\nDMG Cast Skill = 20");
                System.out.println("Hp Aria saat ini: " + HpCharacter[0]);
                PilihSkill = input.nextLine();

                if (PilihSkill.equals("1") || PilihSkill.equalsIgnoreCase("Basic Attack")) {
                    System.out.println("Silahkan pilih suatu angka dari 1-2, jika tebakanmu benar kamu dapat melancarkan serangan!");
                    tebak = input.nextInt();
                    input.nextLine();
                    if(tebak == AngkaRandom){
                        System.out.println("Bisky melancarkan Basic Attack kepada Aria, mengurangi 10 HP");
                        HpCharacter[0] -= 10;
                    } else{
                        System.out.println("Gagal melancarkan serangan, tebakan anda salah!! menghasilkan 0 damage");
                    }
                } else if (PilihSkill.equals("2") || PilihSkill.equalsIgnoreCase("Cast Skill")) {
                    System.out.println("Silahkan pilih suatu angka dari 1-2, jika tebakanmu benar kamu dapat melancarkan serangan!");
                    tebak = input.nextInt();
                    input.nextLine();
                    if(tebak==AngkaRandom){
                        System.out.println("Bisky melancarkan Cast Skill kepada Aria, mengurangi 20 HP");
                        HpCharacter[0] -= 20;
                    } else{
                        System.out.println("Gagal melancarkan serangan, tebakan anda salah!! menghasilkan 0 damage");
                    }
                }
                System.out.println("HP Aria tersisa " + HpCharacter[0] + "\n");
            }
            turn = !turn;
        }
    }
     
}
