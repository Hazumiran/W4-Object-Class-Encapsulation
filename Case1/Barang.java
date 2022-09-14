package Case1;

public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok;
	public Barang(String kode, String nama, int stk) { 
		kode_barang = kode;
		nama_barang = nama; 
		stok = stk;
	}
	public int ShowStock() {
		return stok;
	}
	
	public void SetStock(int Add_Stock) {
		 this.stok = Add_Stock;
		
	}
	public void AddStock(int Add_Stock) {
		this.stok += Add_Stock;
	}
}
