import com.basho.riak.client.api.RiakClient;
import com.basho.riak.client.api.commands.kv.DeleteValue;
import com.basho.riak.client.api.commands.kv.FetchValue;
import com.basho.riak.client.api.commands.kv.StoreValue;
import com.basho.riak.client.api.commands.kv.UpdateValue;
import com.basho.riak.client.core.query.Location;
import com.basho.riak.client.core.query.Namespace;

public class RiakTest {

    public static void main(String[] args) {
        RiakClient client = null;
        String port = args[0];
        String address = args[1];
        try {
            if(args.length<2) {
                client = RiakClient.newClient(8087, "ip172-18-0-66-c2r58qnnjsv000f9u2ig-8087.direct.labs.play-with-docker.com");
            } else {
                client = RiakClient.newClient(port, address);
            }
            Character gandalf = new Character("Gandalf", "Wizard", "Aiar", 11000L);

            //WRZUCENIE DOKUMENTU
            Namespace s9468Bucket = new Namespace("s9468");
            Location gandalfLocation = new Location(s9468Bucket, "Gandalf");
            StoreValue storeCharacter = new StoreValue.Builder(gandalf)
                    .withLocation(gandalfLocation)
                    .build();
            client.execute(storeCharacter);
            System.out.println("Character: " + gandalf.toString() + " has been stored inside bucket with name: " + s9468Bucket.getBucketNameAsString()
                    + " in a store location with key: " + gandalfLocation.getKeyAsString());

            //POBRANIE DOKUMENTU
            FetchValue fetchedCharacter = new FetchValue.Builder(gandalfLocation)
                    .build();
            Character fetchedGandalf = client.execute(fetchedCharacter).getValue(Character.class);
            System.out.println("Character " + fetchedGandalf.toString() + " has been fetched from location: " + gandalfLocation.getKeyAsString());

            //ZMODYFIKOWANIE DOKUMENTU
            fetchedGandalf.setAge(5000L);
            System.out.println("Changing character age to 5000");
            CharacterUpdate gandalfUpdate = new CharacterUpdate(fetchedGandalf);
            UpdateValue updateValue = new UpdateValue.Builder(gandalfLocation)
                    .withUpdate(gandalfUpdate).build();
            UpdateValue.Response response = client.execute(updateValue);

            System.out.println("Success status of an update is: " + response.wasUpdated());

            //POBRANIE DOKUMENTU
            Character updatedGandalf = client.execute(fetchedCharacter).getValue(Character.class);
            System.out.println("Updated Character " + updatedGandalf.toString() + " has been fetched from location: " + gandalfLocation.getKeyAsString());


            //USUNIECIE DOKUMENTU
            System.out.println("Deleting character Gandalf!");
            DeleteValue deletedCharacter = new DeleteValue.Builder(gandalfLocation)
                    .build();
            client.execute(deletedCharacter);

            //POBRANIE DOKUMENTU
            try{
                fetchedGandalf = client.execute(fetchedCharacter).getValue(Character.class);
                System.out.println("Character " + fetchedGandalf.toString() + " has been fetcher from location: " + gandalfLocation.getKeyAsString());
            } catch (Exception e){
                System.out.println("Error during fetching deleted character");
            }
            client.shutdown();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            client.shutdown();
        }
    }

}
