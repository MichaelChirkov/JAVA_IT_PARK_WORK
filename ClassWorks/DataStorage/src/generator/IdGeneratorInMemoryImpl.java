package generator;

/**
 * Created by Michael on 26.04.2017.
 */
public class IdGeneratorInMemoryImpl implements IdGenerator {
    private int lastGeneratedId;

    public IdGeneratorInMemoryImpl() {
        lastGeneratedId = -1;
    }

    @Override
    public int nextId() {
        lastGeneratedId = lastGeneratedId + 1;
        return lastGeneratedId;
    }
}