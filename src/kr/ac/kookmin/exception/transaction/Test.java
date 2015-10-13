package kr.ac.kookmin.exception.transaction;

class Bank{
	private int balance = 1000;
	public void oneqTrade() {
		try{
			tradeWithA();
			tradeWithB();
			tradeWithC();
		}catch(Exception e){
			System.out.println("거래중 에러 발생, 전체 취소");
			cancelA();
			cancelB();
			cancelC();
		}
		System.out.println("잔여금액: " + balance);
	}
	
	public void tradeWithA() {
		int m = 100; // a 에서 출금할 금액
			System.out.println("A 계좌에서 출금 - "+m);
			balance -=m;
	}
	public void tradeWithB() {
		int m = 200;// b 에서 출금할 금액
			System.out.println("B 계좌에서 출금 - " + m);
			balance -= m;
	}
	public void tradeWithC() throws Exception{
		int m = 300; // c 에서 출금할 금액
		
		System.out.println("C 계좌에서 출금 - " + m);
		balance -= m;
		Exception ex = new Exception();
		throw ex;
		
	}
	
	public void cancelA() {
		System.out.println("A 계좌 거래 취소 ");
		balance += 100;
	}
	public void cancelB() {
		System.out.println("B 계좌 거래 취소");
		balance += 200;
	}
	public void cancelC() {
		System.out.println("C 계좌 거래 취소");
		balance += 300;
	}
}


public class Test {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.oneqTrade();
	}

}
