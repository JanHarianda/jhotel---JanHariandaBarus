
/**
 * Enumeration class StatusKamar - class ini untuk membatasi status kamar yang dapat diterima.
 * 
 * @author (Jan Harianda Barus)
 * @version (March 10, 2018)
 * 
 */
enum StatusKamar 
{
    Booked("Booked"), Processed("Processed"), Vacant("Vacant");
    
    public String Status;
    
    StatusKamar(String Status){
        this.Status = Status;
    }
}
