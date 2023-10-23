import java.util.Scanner;

public class sorterare{


    static void sortering(int[] sekvens){

        for (int i = 0; i < sekvens.length - 1; i++){

            
            for(int a = 0; a < sekvens.length - 1; a++){

                
                if (sekvens[a] > sekvens[a + 1]){
                    int n1 = sekvens[a ];
                    sekvens[a] = sekvens[a + 1];
                    sekvens[a + 1] = n1;

                }

            }

        }

        for(int i = 0; i < sekvens.length; i++){

            System.out.println(String.valueOf(sekvens[i]));

        }

            
        

    }
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        String[] s = t.nextLine().split(" ");

        int[] sekvens = new int[s.length];
        for(int i = 0; i < s.length; i++){

            sekvens[i] = Integer.parseInt(s[i]);

        }
        
        sortering(sekvens);
        t.close();
    }
}