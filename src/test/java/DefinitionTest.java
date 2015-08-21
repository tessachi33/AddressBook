import org.junit.*;
import static org.junit.Assert.*;



public class DefinitionTest {

  @Rule
   public ClearRule clearRule = new ClearRule();

   @Test
     public void definition_instantiatesCorrectly_true() {
        Definition myDefinition = new Definition("a definition here");
       assertEquals(true, myDefinition instanceof Definition);
     }

  //     @Test
  //  public void all_returnsAllInstancesOfDefinition_true() {
  //    Definition myDefinition1 = new Definition("A definition here");
  //    Definition myDefinition2 = new Definition("Another definition here");
  //   assertTrue(Definition.all().contains(myDefinition1));
  //   assertTrue(Definition.all().contains(myDefinition2));
  // }
  //
  //   @Test
  //  public void newId_definitionInstantiateWithAnID_true() {
  //   Definition myDefinition = new Definition("an animal with fur");
  //  assertEquals(Definition.all().size(), myDefinition.getId());
  //  }
  //
  //  @Test
  //  public void find_returnsDefinitionWithSameId_secondTask() {
  //    Definition myDefinition1 = new Definition("An animal with scales");
  //    Definition myDefinition2 = new Definition("an animal with gills");
  //   assertEquals(Definition.find(myDefinition2.getId()), myDefinition2);
  //   }
  //
  // @Test
  // public void find_returnsNullWhenNoDefinitionFound_null() {
  //   assertTrue(Definition.find(999) == null);
  //   }
  //
  // @Test
  // public void clear_emptiesAllDefinitionFromArrayList() {
  //   Definition myDefinition = new Definition("A definition here");
  //   Definition.clear();
  //   assertEquals(Definition.all().size(), 0);
  // }

}
