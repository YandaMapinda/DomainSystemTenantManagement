package property.tenant.manegement;

import org.junit.Assert;
import org.junit.Test;
import property.tenant.manegement.factory.property.RentalTransfersFactory;
import property.tenant.manegement.domain.property.RentalTransfers;

public class RentalTransfersFactoryTest {
    @Test
    public void testRentalTransfers(){
        int rental_transfer_id =445;
        int from_unit_id=556;
        RentalTransfers f = RentalTransfersFactory.getRentalTransfers(rental_transfer_id,from_unit_id);
        System.out.println(f);
        Assert.assertNotNull(f.getRental_transfer_id());
    }
}
