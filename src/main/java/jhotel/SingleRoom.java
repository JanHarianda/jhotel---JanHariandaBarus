package jhotel;
/**
 * berikut adalah kelas SingleRoom
 *
 * @author (Jan Harianda Barus)
 * @version (April 18, 2018)
 */
public class SingleRoom extends Room
{
    // instance variables
    private  TipeKamar TIPE_KAMAR = TipeKamar.SINGLE;

    /**
     * Konstruktor dari class SingleRoom.
     *
     * @param hotel sebagai hotel yang memiliki kamar
     * @param nomor_kamar  nomor kamar
     */
    public SingleRoom(Hotel hotel, String nomor_kamar)
    {
        super(hotel, nomor_kamar);
        setDailyTariff(100000);
    }

    /**
     * Method untuk mengambil nilai tipe kamar
     *
     * @return TIPE_KAMAR(TipeKamar)
     */
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }

    /**
     * menentukan nilai daily tarif
     *
     * @param dailytariff nilai daily tariff
     */
    public void setDailyTariff(double dailytariff)
    {
        dailyTariff = dailytariff;
    }
}
