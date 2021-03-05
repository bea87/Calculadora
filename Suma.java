/**
 * Esta clase implementa todos los m�todos que est�n relacionados con la suma.
 * @author Alberto Aguado
 * @version 4.0
 * @since 28-02-2021
 *
 */

public class Suma {
	
	private int operandoEntero1;
	private int operandoEntero2;
	private int operandoEntero3;
	private double operandoReal1;
	private double operandoReal2;
	private double operandoReal3;
	
	private int solucionEntero;
	private double solucionReal;
	
	private int valorAcumulado = 0;
	
	/** Constructor con todos los parametros
	 * 
	 * @param operandoEntero1
	 * @param operandoEntero2
	 * @param operandoEntero3
	 * @param operandoReal1
	 * @param operandoReal2
	 * @param operandoReal3
	 * @param solucionEntero
	 * @param solucionReal
	 * @param valorAcumulado
	 */
	public Suma(int operandoEntero1, int operandoEntero2, int operandoEntero3, double operandoReal1,
			double operandoReal2, double operandoReal3, int solucionEntero, double solucionReal, int valorAcumulado) {
		super();
		this.operandoEntero1 = operandoEntero1;
		this.operandoEntero2 = operandoEntero2;
		this.operandoEntero3 = operandoEntero3;
		this.operandoReal1 = operandoReal1;
		this.operandoReal2 = operandoReal2;
		this.operandoReal3 = operandoReal3;
		this.solucionEntero = solucionEntero;
		this.solucionReal = solucionReal;
		this.valorAcumulado = valorAcumulado;
	}
	
	/** Constructor vacio
	 * 
	 */
	public Suma() {
		super();
	}



	/**
	 * Suma de dos n�meros reales
	 * @param operandoReal1 N�mero real, par�metro de entrada, puede ser negativo
	 * @param operandoReal2 N�mero real, par�metro de entrada, puede ser negativo
	 * @return solucionReal N�mero real, par�metro de salida. Soluci�n a la suma de los dos par�metros de entrada
	 */
	public double sumaDosReales(double operandoReal1, double operandoReal2) {
		this.solucionReal = operandoReal1 + operandoReal2;
		if (solucionReal < 999999999) {
			return solucionReal;
		} else {
			return 999999999;
		}
		
	}
	
	/**
	 * Suma de dos n�meros enteros
	 * @param operandoEntero1 N�mero entero, par�metro de entrada, no negativo
	 * @param operandoEntero2 N�mero entero, par�metro de entrada, no negativo
	 * @return solucionEntero N�mero entero, par�metro de salida. Soluci�n a la suma de los dos par�metros de entrada
	 */
	public int sumaDosEnteros(int operandoEntero1, int operandoEntero2) {
		this.solucionEntero = operandoEntero1 + operandoEntero2;
		if (solucionEntero < 999999999) {
			return solucionEntero;
		} else {
			return 999999999;
		}
	} 
	
	/**
	 * Suma de tres n�meros reales
	 * @param operandoReal1 N�mero real, par�metro de entrada, puede ser negativo
	 * @param operandoReal2 N�mero real, par�metro de entrada, puede ser negativo
	 * @param operandoReal3 N�mero real, par�metro de salida. Soluci�n a la suma de los tres par�metros de entrada
	 * @return
	 */
	public double sumaTresReales(double operandoReal1, double operandoReal2, double operandoReal3) {
		this.solucionReal = operandoReal1 + operandoReal2 + operandoReal3;
		if (solucionReal < 999999999) {
			return solucionReal;
		} else {
			return 999999999;
		}
	}
	
	/**
	 * Suma con valor acumulado
	 * @param operandoEntero1, puede ser negativo
	 * No podr�n ser valores mayores de 999999999
	 */
	public void sumaValorAcumulado(int operandoEntero1) {
		this.valorAcumulado += operandoEntero1;
		if (this.valorAcumulado > 999999999) {
			this.valorAcumulado = 999999999;
		}
	}

	
	/*
	 * Getters and Setters
	 */
	public int getOperandoEntero1() {
		return operandoEntero1;
	}

	public void setOperandoEntero1(int operandoEntero1) {
		this.operandoEntero1 = operandoEntero1;
	}

	public int getOperandoEntero2() {
		return operandoEntero2;
	}

	public void setOperandoEntero2(int operandoEntero2) {
		this.operandoEntero2 = operandoEntero2;
	}

	public int getOperandoEntero3() {
		return operandoEntero3;
	}

	public void setOperandoEntero3(int operandoEntero3) {
		this.operandoEntero3 = operandoEntero3;
	}

	public double getOperandoReal1() {
		return operandoReal1;
	}

	public void setOperandoReal1(double operandoReal1) {
		this.operandoReal1 = operandoReal1;
	}

	public double getOperandoReal2() {
		return operandoReal2;
	}

	public void setOperandoReal2(double operandoReal2) {
		this.operandoReal2 = operandoReal2;
	}

	public double getOperandoReal3() {
		return operandoReal3;
	}

	public void setOperandoReal3(double operandoReal3) {
		this.operandoReal3 = operandoReal3;
	}

	public int getSolucionEntero() {
		return solucionEntero;
	}

	public void setSolucionEntero(int solucionEntero) {
		this.solucionEntero = solucionEntero;
	}

	public double getSolucionReal() {
		return solucionReal;
	}

	public void setSolucionReal(double solucionReal) {
		this.solucionReal = solucionReal;
	}

	public int getValorAcumulado() {
		return valorAcumulado;
	}

	public void setValorAcumulado(int valorAcumulado) {
		this.valorAcumulado = valorAcumulado;
	}
}
	
	
