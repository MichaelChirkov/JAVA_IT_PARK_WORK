/**
 * Created by vclass16 on 01.04.2017.
 */
public class SuperHero {

    protected String name;
    protected int enemyCount;

    SuperHero( String name, int enemyCount){
        this.name = name;
        this.enemyCount = enemyCount;
    }

    public String getName() {
        return name;
    }

    public int getEnemyCount() {
        return enemyCount;
    }
}
