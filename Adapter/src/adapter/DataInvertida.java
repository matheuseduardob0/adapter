package adapter;

public class DataInvertida extends DataPadrao{
	public DataInvertida(int ano, int mes, int dia) {
		this.setAno(ano);
		this.setMes(mes);
		this.setDia(dia);
	}
	public void diaMes(int dia, int mes){
		this.setDia(dia);
		this.setMes(mes);
	}
}
