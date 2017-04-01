/**
 * Created by vclass16 on 01.04.2017.
 */
public class Program {

    public static void sort(SuperHero superheroes[]){
        SuperHero temp;
        for (int i = superheroes.length; i > 0; i--){
            for (int j = 0; j < superheroes.length -1; j++){
                if (superheroes[j].getEnemyCount() > superheroes[j+1].getEnemyCount()){
                    temp = superheroes[j];
                    superheroes[j] = superheroes[j + 1];
                    superheroes[j + 1] = temp;
                }
            }
        }
    }

    public static void main (String[] args) {

        Humans egor = new Humans("Egor", 5);
        Humans petya = new Humans("Petya", 7);
        Humans bob = new Humans("Bob", 9);
        Humans john = new Humans("John", 11);

        Mutants mutantsBen = new Mutants("Ben", 10);
        Mutants mutantsSteeve = new Mutants("Steeve", 1);

        SuperHero superheroes[] = {egor,
                petya,
                bob,
                mutantsBen,
                john,
                mutantsSteeve
        };

        for (int i = 0; i < superheroes.length ; i ++){
            System.out.println("I' m " + superheroes[i].getName() + " and I have " + superheroes[i].getEnemyCount());
        }
        
        sort(superheroes);

        System.out.println();
        for (int i = 0; i < superheroes.length ; i ++){
            System.out.println("I' m " + superheroes[i].getName() + " and I have " + superheroes[i].getEnemyCount());
        }
    }
}
