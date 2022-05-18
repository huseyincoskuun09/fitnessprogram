
public class idman {

	private int burpee_sayısı ;
    private int pushup_sayısı ;
    private int situp_sayısı ;
    private int squat_sayısı ;
	public idman(int burpee_sayısı, int pushup_sayısı, int situp_sayısı, int squat_sayısı) {
		super();
		this.burpee_sayısı = burpee_sayısı;
		this.pushup_sayısı = pushup_sayısı;
		this.situp_sayısı = situp_sayısı;
		this.squat_sayısı = squat_sayısı;
	}
	public int getBurpee_sayısı() {
		return burpee_sayısı;
	}
	public void setBurpee_sayısı(int burpee_sayısı) {
		this.burpee_sayısı = burpee_sayısı;
	}
	public int getPushup_sayısı() {
		return pushup_sayısı;
	}
	public void setPushup_sayısı(int pushup_sayısı) {
		this.pushup_sayısı = pushup_sayısı;
	}
	public int getSitup_sayısı() {
		return situp_sayısı;
	}
	public void setSitup_sayısı(int situp_sayısı) {
		this.situp_sayısı = situp_sayısı;
	}
	public int getSquat_sayısı() {
		return squat_sayısı;
	}
	public void setSquat_sayısı(int squat_sayısı) {
		this.squat_sayısı = squat_sayısı;
	}
    public void hareketyap(String haraketTuru , int sayı) {
    	if(haraketTuru.equals("Burpee")) {
    		
    		burpeeYap(sayı);
    		
    	}
    	else if(haraketTuru.equals("Pushup")){
    		pushupYap(sayı);
    		
    	}
    	else if(haraketTuru.equals("Situp")){
    		situpYap(sayı);
    		
    	}	else if(haraketTuru.equals("Squat")){
    		squadYap(sayı);
    		
    	}
    	else {
    		System.out.println("Geçersiz hareket...");
    	}
    	
    }
    public void burpeeYap(int sayı) {
    	if(burpee_sayısı == 0) {
    		System.out.println("Yapacak burpee kalmadı ..");
    	}
    	if(burpee_sayısı - sayı < 0) {
    		System.out.println("Tebrikler hedeflediğin burpee sayısını geçtin..");
    		burpee_sayısı = 0 ;
    		System.out.println("Kalan burpee sayısı : " +burpee_sayısı);
    	}
    	else {
    		burpee_sayısı -= sayı ;
    		System.out.println("Kalan burpee sayısı " +burpee_sayısı );
    	}
    }
    public void pushupYap(int sayı) {
    	if(pushup_sayısı == 0) {
    		System.out.println("Yapacak pushup kalmadı ..");
    	}
    	if(pushup_sayısı - sayı < 0) {
    		System.out.println("Tebrikler hedeflediğin pushup sayısını geçtin..");
    		pushup_sayısı = 0 ;
    		System.out.println("Kalan pushup sayısı : " +pushup_sayısı);
    	}
    	else {
    		pushup_sayısı -= sayı ;
    		System.out.println("Kalan pushup sayısı " +pushup_sayısı );
    	}
    }
    public void situpYap(int sayı) {
    	if(situp_sayısı == 0) {
    		System.out.println("Yapacak situp kalmadı ..");
    	}
    	if(situp_sayısı - sayı < 0) {
    		System.out.println("Tebrikler hedeflediğin situp sayısını geçtin..");
    		situp_sayısı = 0 ;
    		System.out.println("Kalan burpee sayısı : " +situp_sayısı);
    	}
    	else {
    		situp_sayısı -= sayı ;
    		System.out.println("Kalan situp sayısı " +situp_sayısı );
    	}
    }
    public void squadYap(int sayı) {
    	if(squat_sayısı == 0) {
    		System.out.println("Yapacak squat kalmadı ..");
    	}
    	if(squat_sayısı - sayı < 0) {
    		System.out.println("Tebrikler hedeflediğin squat sayısını geçtin..");
    		squat_sayısı = 0 ;
    		System.out.println("Kalan squat sayısı : " +squat_sayısı);
    	}
    	else {
    		squat_sayısı -= sayı ;
    		System.out.println("Kalan squat sayısı " +squat_sayısı );
    	}
    }
    
    public boolean idmanbittimi() {
    	return (burpee_sayısı == 0 ) && (pushup_sayısı == 0 )&& (situp_sayısı == 0) && (squat_sayısı == 0 )  ;
    	
    }
	
}
