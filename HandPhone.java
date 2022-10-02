public class HandPhone { 
    
    String jenis_hp; 
    int tahun_pembuatan; 
    public void setDataHP(String jenis_hp, int tahun_pembuatan){ 
        
        this.jenis_hp=jenis_hp; 
        this.tahun_pembuatan=tahun_pembuatan; 
    } 
    String getJenisHp(){ 
        
        return this.jenis_hp; 
    } 
    int getTahunPembuatan(){ 
        
        return this.tahun_pembuatan; 
    } 
    public static void main(String[] args) { 
        
        HandPhone hp=new HandPhone(); 
        hp.setDataHP("Realme Narzo 5G", 2022); 
        System.out.println(hp.getJenisHp()); 
        System.out.println(hp.getTahunPembuatan()); 
    }
}
