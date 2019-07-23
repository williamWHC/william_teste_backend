
public class Usuario {
	private String nm_customer;
	private int id_customer;
	private int cpf_cnpj;
	private String is_active;
	private float vl_total;
	public String getnm_customer() {
		return nm_customer;
	}
	public void setnm_customer(String nm_customer) {
		this.nm_customer = nm_customer;
	}
	public int getid_customer() {
		return id_customer;
	}
	public void setid_customer(int id_customer) {
		this.id_customer = id_customer;
	}
	public int getcpf_cnpj() {
		return cpf_cnpj;
	}
	public void setcpf_cnpj(int cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	public String getis_active() {
		return is_active;
	}
	public void setis_active(String is_active) {
		this.is_active = is_active;
	}
	public void setvl_total(float vl_total) {
		this.vl_total = vl_total;
	}
	public float getvl_total() {
		return vl_total;
	}
}
import java.util.Scanner;

public class Conta {
	private String nm_customer;
	private int id_customer, cpf_cnpj;
	private String is_active;
	private float vl_total;
	

    private double vl_total;
    Scanner entrada = new Scanner(System.in);
	
	System.out.print("Nome do cliente:", this.nm_customer);
	System.out.print("Código do cliente:", this.id_customer);
	System.out.print("CPF OU CNPJ cliente:", this.cpf_cnpj);
    
    public Conta(String nm_customer, double vl_total_inicial){
        this.nm_customer=nm_customer;
    }
    
    public void extrato(){
        System.out.println("\tEXTRATO");
        System.out.println("nm_customer: " + this.nm_customer);
        System.out.printf("Saldo atual: %.2f\n",this.vl_total);
    }
	
	if(vl_total >= 560) && (id_customer between 1500 and 2700)
	{
	mf = vl_float
	System.out.print("Media:");
	}
	else
	{
	System.out.print("Status do cliente:", this.is_active);
	}
	}
