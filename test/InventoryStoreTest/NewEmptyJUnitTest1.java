
package InventoryStoreTest;

import com.capsys.InventoryStore.Utility.MainFrameValidation;
import junit.framework.TestCase;
import org.junit.Test;


public class NewEmptyJUnitTest1 
{
    String productId = "1245000000";	
    MainFrameValidation validation = new MainFrameValidation();
   
   @Test
   public void testPrintMessage() 
   {	
    TestCase.assertTrue("Id exists in the database", validation.validateProductId(productId));
   }
}
