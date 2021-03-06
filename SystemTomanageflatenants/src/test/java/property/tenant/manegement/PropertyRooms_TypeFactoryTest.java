package property.tenant.manegement;

import org.junit.Assert;
import org.junit.Test;
import property.tenant.manegement.domain.property.PropertyRooms_Type;
import property.tenant.manegement.factory.property.PropertyRooms_TypeFactory;

public class PropertyRooms_TypeFactoryTest {
    @Test
    public void testPropertyRooms_Type(){
        String unit_type_name="single rooms";
        PropertyRooms_Type f = PropertyRooms_TypeFactory.getPropertyRooms_Type(unit_type_name);
        System.out.println(f);
        Assert.assertNotNull(f.getUnit_type_name());
    }
}
