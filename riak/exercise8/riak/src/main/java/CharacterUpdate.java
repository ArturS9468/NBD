import com.basho.riak.client.api.commands.kv.UpdateValue;

public class CharacterUpdate extends UpdateValue.Update<Character> {
    private final Character update;
    public CharacterUpdate(Character update){
        this.update = update;
    }

    @Override
    public Character apply(Character t) {
        return new Character(update.getName(), update.getClazz(), update.getRace(), update.getAge());
    }
}